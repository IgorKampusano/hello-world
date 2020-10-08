package FirstSemester.lab4;
import java.util.Scanner;
public class Prog41 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double x,E,S,R,x4,y;
        int k;
        Scanner inp = new Scanner(System.in);
        System.out.print("x="); x=inp.nextDouble();
        System.out.print("E="); E=inp.nextDouble();
        inp.close();

        x4=Math.pow(x, 4);
        R=x4/120;
        k=1;
        S=R*2*Math.pow(x, 4)*(5+x)/120;
        do {
            k=k+1;
            R=R*x4/((4*k+1)*4*k*(4*k-1)*(4*k-2));
            S=S+R*2*(4*k+1+x);
        } while ((Math.abs(R/S)>E)&&(k<1000));
        if (k==1000)
            System.out.println("Ошибка");
        else {
            y=Math.sin(x)-2*x-2+Math.cos(x)+Math.exp(x);
            System.out.printf("S=%1.8f\ny=%1.8f\nE=%1.8f\nk=%d", S,y,Math.abs(S-y),k);
        }

    }
}
