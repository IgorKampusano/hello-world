package AbramyanTasks.Begin;
import java.util.Scanner;
public class Begin1 {
    public static void main(String[] args) {
        double a,P;
        Scanner in = new Scanner(System.in);
        System.out.println("Программа расчета периметра квадрата.");
        System.out.print("Введите сторону квадрата: "); a = in.nextDouble();
        in.close();

        P = 4 * a;
        System.out.printf("Периметр квадрата равен: %1.4f ", P);

    }

}
