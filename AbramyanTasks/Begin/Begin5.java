package AbramyanTasks.Begin;
import java.util.Scanner;
public class Begin5 {
    public static void main(String[] args) {
        double a,S,V;
        System.out.println("Программа расчета объёма куба и площади его поверхности.");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ребро куба: "); a = in.nextDouble();
        in.close();

        S = 6*a*a;
        V = Math.cbrt(a);
        System.out.printf("Площадь поверхности куба равна: %1.4f", S);
        System.out.printf("Объём куба равен: %1.4f", V);

    
    }
}
