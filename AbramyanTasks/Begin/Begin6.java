package AbramyanTasks.Begin;
import java.util.Scanner;
public class Begin6 {
    public static void main(String[] args) {
        double a,b,c,S,V;
        System.out.println("Программа расчета объёма прямоугольного параллелепипеда и площади его поверхности.");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину первого ребра: ");  a = in.nextDouble();
        System.out.print("Введите длину второго ребра: ");  b = in.nextDouble();
        System.out.print("Введите длину третьего ребра: ");  c = in.nextDouble();
        in.close();

        S = 2*(a*b + b*c + a*c);
        V = a*b*c;
        System.out.printf("Площадь поверхности прямоугольного параллелепипеда: %1.4f", S);
        System.out.printf("Объём прямоугольного параллелепипеда: %1.4f", V);

    }
}
