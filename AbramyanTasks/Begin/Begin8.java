package AbramyanTasks.Begin;
import java.util.Scanner;
public class Begin8 {
    public static void main(String[] args) {
        double a,b,sr;
        System.out.println("Программа расчета среднего арифметического двух чисел.");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: "); a = in.nextDouble();
        System.out.print("Введите второе число: "); b = in.nextDouble();
        in.close();

        sr = (a+b)/2;
        System.out.printf("Среднее арифметическое равно: %1.4f", sr);

    }
}
