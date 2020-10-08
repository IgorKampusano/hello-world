package Practice_work;
import java.util.Scanner;
public class Prog2 {
    public static void main(String[] args) {
        int L = 0,N,M;
        double C,B;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность матрицы.");
        System.out.print("Количество строк: "); N = in.nextInt();
        System.out.print("Количество столбцов: "); M = in.nextInt();
        System.out.println("Введите границы интервала.");
        System.out.print("Начало интервала: "); C = in.nextDouble();
        System.out.print("Конец интервала: "); B = in.nextDouble();
        double[][] x = new double[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("x("+i+","+j+")= ");
                x[i][j] = in.nextDouble();
            }
        }
        in.close();


        double Sr;
        // создаем массив для хранения средних арифметических
        double[] y = new double[N];




        // считаем среднее арифметическое в каждой строке матрицы
        for (int i = 0; i < N; i++) {
            double S = 0;
            for (int j = 0; j < M; j++) {
                S = S + x[i][j];
            }
            Sr = S/M;
            if ((Sr >= C) && (Sr <= B)) {
                y[L] = Sr;
                L++;
            }
        }



        System.out.println("Исходная матрица.");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.printf("%6.2f ", x[i][j]);

            }
        System.out.println();
        }

        if (L == 0) {
            System.out.println("Массив пуст.");
        }
        else {
            System.out.println("Сформированный одномерный массив.");
            for (int k = 0; k < L; k++) {
                System.out.println("y("+k+")=" + y[k]);
            }
        }





    }



}
