package AbramyanTasks.Begin;
import java.util.Scanner;
public class Begin11 {
    public static void main(String[] args) {
        double a,b,absoluteA,absoluteB,sum,dif,mul,div;
        Scanner in = new Scanner(System.in);
        System.out.println("Программа расчета суммы, разности, произведения и частного модулей двух ненулевых чисел");
        System.out.print("Введите первое число: "); a = in.nextDouble();
        System.out.print("Введите второе число: "); b = in.nextDouble();
        in.close();

        absoluteA = Math.abs(a);
        absoluteB = Math.abs(b);
        sum = absoluteA + absoluteB;
        dif = absoluteA - absoluteB;
        mul = absoluteA*absoluteB;
        div = absoluteA/absoluteB;
        System.out.printf("Сумма модулей двух ненулевых чисел равна: ", sum);
        System.out.printf("Разность модулей двух ненулевых чисел равна: ", dif);
        System.out.printf("Произведение модулей двух ненулевых чисел равна: ", mul);
        System.out.printf("Частное модулей двух ненулевых чисел равна: ", div);

    }
}
