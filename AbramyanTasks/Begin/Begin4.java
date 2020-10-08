package AbramyanTasks.Begin;
import java.util.Scanner;
public class Begin4 {
    public static void main(String[] args) {
        double d,L;
        final double pi = 3.14;
        System.out.println("Программа расчета длины окружности.");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите диаметр окружности: "); d = in.nextDouble();
        in.close();

        L = pi * d;
        System.out.printf("Длина окружности равна: %1.4f", L);
    }
}
