package AbramyanTasks.Begin;
import java.util.Scanner;
public class Begin9 {
    public static void main(String[] args) {
        double a,b,srGeo;
        System.out.println("Программа расчета среднего геометрического двух неотрицательных чисел.");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: "); a = in.nextDouble();
        System.out.print("Введите второе число: "); b = in.nextDouble();

        if ((a < 0) || (b < 0)) {
            System.out.println("Ошибка: введено отрицательное число!");
        }

        if ((a > 0) && (b > 0)) {
            srGeo = Math.sqrt(a + b);
            System.out.printf("Среднее геометрическое двух неотрицательных чисел равно: %1.4f", srGeo);
        }
    }
}
