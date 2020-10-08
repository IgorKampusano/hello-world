package OOP_Denis.lab2;
import java.io.*;
import java.util.*;
import java.util.Map.Entry;
public class HashMapProg {
    public static void main(String[] args) throws IOException {

        Map<Integer, String> map = new HashMap<Integer, String>();
        Queue<String> pq = new PriorityQueue<String>();
        BufferedReader bufferedReader = null;
        Integer key = 1;

        try {
            bufferedReader = new BufferedReader(new FileReader("C:\\word.txt")); // ��������� FileWriter � BufferedReader
            String line;

            while((line = bufferedReader.readLine()) != null) {
                pq.add(line);


                map.put(key, line);
                key++;
            }

        } finally {
            bufferedReader.close(); // ��������� BufferedReader
        }

//        public static <K, V> void removeTheFirstNameDuplicates(Map<K, V> map) throws Exception {
//            Map<K, V> tmp = new HashMap<K, V>();
//            for (Iterator<K> it = map.keySet().iterator(); it.hasNext();) {
//                K key = it.next();
//                V val = map.get(key);
//                if (!tmp.containsValue(val)) {
//                    tmp.put(key, val);
//                }
//            }
//            map.clear();
//            for (Iterator<K> it = tmp.keySet().iterator(); it.hasNext();) {
//                K key = it.next();
//                map.put((K) tmp.get(key), (V) key);
//            }
//        }


        FileWriter writer = new FileWriter("C:\\word1.txt", true);
        System.out.println();

        for (Map.Entry<Integer,String> entry:map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            writer.write(entry.getKey() + ": " + entry.getValue() + "\r\n");
        }
        writer.close();
    }
}
