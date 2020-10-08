package AbramyanTasks.Begin;
import java.util.Scanner;
public class Begin10 {
    public static void main(String[] args) {
        double a,b,squareA,squareB,sum,dif,mul,div;
        System.out.print("Программа расчета суммы, разности, произведения и частного квадратов двух ненулевых чисел.");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: "); a = in.nextDouble();
        System.out.print("Введите второе число: "); b = in.nextDouble();
        in.close();

        squareA = a*a;
        squareB = b*b;
        sum = squareA + squareB;
        dif = squareA - squareB;
        mul = squareA*squareB;
        div = squareA/squareB;
        System.out.printf("Сумма квадратов двух ненулевых чисел равна: %1.4f", sum);
        System.out.printf("Разность квадратов двух ненулевых чисел равна: %1.4f", dif);
        System.out.printf("Произведение квадратов двух ненулевых чисел равна: %1.4f", mul);
        System.out.printf("Частное квадратов двух ненулевых чисел равна: %1.4f", div);
    }
}
