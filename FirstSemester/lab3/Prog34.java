package FirstSemester.lab3;
import java.util.Scanner;
public class Prog34 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double P,S,y,a;
        int M,N;
        Scanner inp = new Scanner(System.in);
        System.out.print("M="); M=inp.nextInt();
        System.out.print("N="); N=inp.nextInt();
        System.out.print("a="); a=inp.nextDouble();
        inp.close();

        P=1;
        for (int i=2; i<=N; i++)
        { S=0;
            for (int k=1; k<=M; k++)
                S+=((double)i+k)/a;
            P*=(double)i/2+S;
        }
        y=P;
        System.out.printf("y=%1.4f", y);

    }
}
