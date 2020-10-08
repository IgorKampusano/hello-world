package FirstSemester.lab3;
import java.util.Scanner;
public class Prog33 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double P1,P2,S,p,a;
        int N,M;
        Scanner inp = new Scanner(System.in);
        System.out.print("M="); M=inp.nextInt();
        System.out.print("N="); N=inp.nextInt();
        System.out.print("a="); a=inp.nextDouble();
        inp.close();

        P1=1; S=0; int j=1;
        do {
            P1*=(j+N)/a;
            S+=Math.pow((j-a), 2);
            j++;
        } while (j<=M);
        P2=1; int i=1;
        do {
            P2*=i-2;
            i++;
        } while (i<=M);
        p=-10+P1+P2+S;
        System.out.printf("p=%1.4f", p);

    }
}
