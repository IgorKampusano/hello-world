package AbramyanTasks.Begin;
import java.util.Scanner;
public class Begin13 {
    public static void main(String[] args) {
        double R1,R2,S1,S2,S3;
        final double pi = 3.14;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите радиус первой окружности: "); R1 = in.nextDouble();
        System.out.print("Введите радиус второй окружности: "); R2 = in.nextDouble();
        in.close();

        S1 = pi*R1*R1;
        S2 = pi*R2*R2;
        S3 = S1 - S2;
        System.out.printf("Площадь первой окружности равна: %1.4f", S1);
        System.out.printf("Площадь второй окружности равна: %1.4f", S2);
        System.out.printf("Площадь кольца с внешним радиусом первой окружности и внутренним радиусом второй окружности равна: 1.4f", S3);

    }
}
