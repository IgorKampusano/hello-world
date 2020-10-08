package AbramyanTasks.Begin;
import java.util.Scanner;
public class Begin12 {
    public static void main(String[] args) {
        double a,b,c,P;
        System.out.println("Программа расчета гипотенузы и периметра прямоугольного треугольника.");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первый катет: "); a = in.nextDouble();
        System.out.print("Введите второй катет: "); b = in.nextDouble();
        in.close();

        c = Math.sqrt(a*a + b*b);
        P = a + b + c;
        System.out.printf("Гипотенуза прямоугольного треугольника равна: %1.4f", c);
        System.out.printf("Периметр прямоугольного треугольника равна: %1.4f", P);

    }
}
