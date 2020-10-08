package Practice_work;
import java.util.Scanner;
public class Prog1 {
    public static void main(String[] args) {
        int k;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        k = in.nextInt();
        double[] y = new double[k];

        for (int i = 0; i < k; i++) {
            System.out.print("y("+i+")= ");
            y[i] = in.nextDouble();
        }
        in.close();

        int NewK = 0;
        double x;

        // удаляем все элементы с дробной частью, создавая новый массив
        for (int i = 0; i < k; i++) {
            x = y[i] - (int)y[i];
            if (x == 0)
            {
                y[NewK] = y[i];
                NewK++;
            }
        }
        k = NewK;
        if (k == 0) {
            System.out.println("Нет элементов с дробной частью.");
        }
        else {
            System.out.println("Массив после удаления элементов с дробной частью.");
            for (int i = 0; i < k; i++) {
                System.out.println("y("+i+")= " + y[i]);
            }
        }

        System.out.println();
        // ищем второй положительный элемент массива
        int count = 0;
        int j = 0;
        int Nfind;
            while ((j < k)&&(count < 2)) {
                if (y[j] > 0) {
                    count++;
                }
                j++;
            }
            if (count < 2)
                Nfind = -1;
            else
                Nfind = j-1;

            // заменяем все элементы с четными номерами на значение второго положительного элемента массива,
            // если таковой будет найден
        if (Nfind == -1) {
            System.out.println("Второй положительный элемент не найден.");
        }
        else {
            for (int i = 0; i < k; i+=2) {
                y[i] = y[Nfind];
            }
        }


        System.out.println("Массив после замены элементов.");
        for (int i = 0; i < k; i++) {
            System.out.println("y("+i+")= " + y[i]);
        }
    }
}
