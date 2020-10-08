package AbramyanTasks.For;
import java.util.Scanner;
public class For2 {
    public static void main(String[] args) {
        int A,B,N;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите наименьшее число в диапозоне: "); A = in.nextInt();
        System.out.print("Введите наибольшее число в диапозоне: "); B = in.nextInt();
        in.close();

        for (int i = 0; i < B; i++) {
            if (A < B)
            System.out.println();
        }
    }
}
