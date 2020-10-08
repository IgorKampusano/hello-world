package AbramyanTasks.Begin;
import java.util.Scanner;
public class Begin2 {
    public static void main(String[] args) {
        double a,S;
        Scanner in = new Scanner(System.in);
        System.out.println("Программа расчета площади квадрата.");
        System.out.println("Введите сторону квадрата: "); a = in.nextDouble();
        in.close();

        S = a * a;
        System.out.printf("Площадь квадрата равна:%1.4а ", S);

    }
}
