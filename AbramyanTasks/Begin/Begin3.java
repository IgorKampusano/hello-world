package AbramyanTasks.Begin;
import java.util.Scanner;
public class Begin3 {
    public static void main(String[] args) {
        double a,b,P,S;
        System.out.println("Программа расчета периметра и площади прямоугольника.");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину прямоугольника: "); a = in.nextDouble();
        System.out.print("Введите ширину прямоугольника: "); b = in.nextDouble();
        in.close();

        P = ( a + b) * 2;
        S = a * b;
        System.out.printf("Периметр прямоугольника равен: %1.4f", P);
        System.out.println();
        System.out.printf("Площадь прямоугольника равна: %1.4f", S);
    }
}
