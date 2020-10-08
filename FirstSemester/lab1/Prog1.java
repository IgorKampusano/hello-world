package FirstSemester.lab1;
import java.util.Scanner;
public class Prog1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double a,b,c,d;
        Scanner inp = new Scanner(System.in);
        System.out.print("a="); a=inp.nextDouble();
        System.out.print("b="); b=inp.nextDouble();
        System.out.print("c="); c=inp.nextDouble();
        inp.close();

        d=(Math.abs(a*a-b*b))/Math.sin(b)-(Math.pow(10, 4))*(Math.pow(Math.abs(Math.sin(a+b)-b*c), 1.0/5))-(4-Math.tan(a))/Math.exp(3);
        System.out.printf("d=%1.4f", d);



    }
}
