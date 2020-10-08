package Practice_work;
import java.util.Scanner;
public class Prog3 {
    public static void main(String[] args) {
        int N, count = 0;
        double y;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность матрицы.");
        System.out.print("Количество столбцов и строк: "); N = in.nextInt();
        double[][] x = new double[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("x("+i+","+j+")= ");
                x[i][j] = in.nextDouble();
            }
        }
        in.close();

        System.out.println("Исходная матрица.");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%6.2f ", x[i][j]);
            }
            System.out.println();

        }
        // считаем целочисленные элементы, стоящие в четных столбцах
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j+=2) {
                if (x[i][j] > 0) {
                    y = x[i][j] - (int)x[i][j];
                    if (y == 0) {
                        count++;
                    }
                }
            }
        }
        // заменяем элементы, лежащие выше второстепенной диагонали
        for (int i = 0; i <= N-2; i++) {
            for (int j = 0; j <= N-i-2; j++) {
                x[i][j] = count;
            }
        }

        System.out.println("Матрица после замены элементов.");

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%6.2f ", x[i][j]);
            }
            System.out.println();
        }
    }
}
