package AbramyanTasks.For;
import java.util.Scanner;
public class For1 {
    public static void main(String[] args) {
        int K,N;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: "); K = in.nextInt();
        System.out.print("Введите количество выводов числа: "); N = in.nextInt();
        in.close();

        for (int i=0; i<N; i++)
            System.out.println(K);
    }

}
