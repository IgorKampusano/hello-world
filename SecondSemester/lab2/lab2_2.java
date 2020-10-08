package SecondSemester.lab2;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.IOException;
public class lab2_2 {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> our = new ArrayList<Student>();
        int N = 0;
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("C:\\students.txt"));
            String S;
            System.out.println("---------------------------------");
            while ((S = in.readLine()) != null) {
                int p = S.indexOf(",");
                Student sort = new Student(S.substring(0, p), Double.parseDouble(S.substring(p + 1)));
                our.add(sort);
                System.out.printf("|%20S|%10.2f\n", our.get(N).getFio(), our.get(N).getHeight());
                N++;
            }

            System.out.println("---------------------------------");
        } finally {
            in.close();
        }

        boolean FlagSort;

        do {
            FlagSort = true;
            for (int i = 0; i <= N - 2; i++)
                if (!(our.get(i).getHeight() >= our.get(i + 1).getHeight())) {
                    Student stud = new Student(our.get(i).getFio(), our.get(i).getHeight());
                    our.set(i, our.get(i+1));
                    our.set((i+1), stud);
                    FlagSort = false;
                }

        } while (FlagSort == false);

        System.out.println(our);

        FileWriter out = new FileWriter("C:\\output.txt");
        System.out.println("Два самых высоких студента в группе:");
        System.out.printf("|%20s|%7.2f\n", our.get(1).getFio(), our.get(1).getHeight());
        System.out.printf("|%20s|%7.2f\n", our.get(2).getFio(), our.get(2).getHeight());
        out.write("Два самых высоких студента в группе: " + "\r\n");
        out.write(our.get(1).getFio() + "," + our.get(1).getHeight() + "\r\n");
        out.write(our.get(2).getFio() + "," + our.get(2).getHeight() + "\r\n");
        out.close();





    }
}
