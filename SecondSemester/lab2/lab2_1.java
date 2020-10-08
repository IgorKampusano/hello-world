package SecondSemester.lab2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.io.IOException;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.io.FileWriter;
public class lab2_1 {
    public static void main(String[] args) throws IOException {

        Map <String, Integer> map = new HashMap<>();
        map.put("Положительные", 0);
        map.put("Отрицательные", 0);
        map.put("Нулевые", 0);
        Queue<String> pq = new PriorityQueue<String>(10);
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("C:\\file.txt"));
            String s;
            double c;
            while ((s = in.readLine()) != null) {
                pq.add(s);
                c = Double.parseDouble(s);

                if (c > 0)
                    map.put("Положительные", map.get("Положительные") + 1);

                if (c < 0)
                    map.put("Отрицательные", map.get("Отрицательные") + 1);

                if (c == 0)
                    map.put("Нулевые", map.get("Нулевые") + 1);
            }
        } finally {
            in.close();
        }

        FileWriter writer = new FileWriter("C:\\file1.txt", true);
        System.out.println();
        for (Map.Entry<String,Integer> entry:map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            writer.write(entry.getKey() + ": " + entry.getValue() + "\r\n");
        }
        writer.close();

    }
}
