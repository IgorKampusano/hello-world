package FirstSemester.lab3;
import java.util.Scanner;
public class Prog31 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double P1,P2,S,p,a;
        int N,M;
        Scanner inp = new Scanner(System.in);
        System.out.print("M="); M=inp.nextInt();
        System.out.print("N="); N=inp.nextInt();
        System.out.print("a="); a=inp.nextDouble();
        inp.close();

        P1=1; S=0;
        for (int j=1; j<=N; j++)
        {
            P1*=(j+N)/a;
            S+=Math.pow((j-a), 2);
        }
        P2=1;
        for (int i=1; i<=M; i++)
            P2*=i-2;
        p=-10+P1+P2+S;
        System.out.printf("p=%1.4f", p);



    }
}
