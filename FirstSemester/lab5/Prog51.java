package FirstSemester.lab5;
import java.util.Scanner;
public class Prog51 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double A,B,H,F,x,Fmax,xmax;
        int N;
        Scanner inp = new Scanner(System.in);
        System.out.print("A="); A=inp.nextDouble();
        System.out.print("B="); B=inp.nextDouble();
        System.out.print("N="); N=inp.nextInt();
        inp.close();

        H=(B-A)/(N-1);
        xmax=A;
        Fmax=Math.pow(2, xmax)+(Math.pow(xmax, 2))/5;
        x=A+H;
        while (x<=B+H/2)
        {
            F=Math.pow(2, x)+(Math.pow(x, 2))/5;
            System.out.printf("%15.4f%15.4f\n", x,F);
            if (F>Fmax) {
                Fmax=F;
                xmax=x;
            }
            x=x+H;

        }
        System.out.printf("xmax=%1.4f\nFmax=%1.4f", xmax,Fmax);



    }
}
