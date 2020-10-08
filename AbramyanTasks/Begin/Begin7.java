package AbramyanTasks.Begin;
import java.util.Scanner;
public class Begin7 {
    public static void main(String[] args) {
        double L,S,R;
        final double pi = 3.14;
        System.out.println("Программа расчта длины окружности и площади круга.");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите радиус окружности: "); R = in.nextDouble();
        in.close();

        L = 2*pi*R;
        S = pi*R*R;
        System.out.printf("Длина окружности равна: %1.4f", L);
        System.out.printf("Площадь круга равна: %1.4f", S);
    }
}
