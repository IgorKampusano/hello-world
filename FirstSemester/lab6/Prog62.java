package FirstSemester.lab6;
import java.util.Scanner;
public class Prog62 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int M,NewM;
        double S=0,Sr;
        Scanner inp = new Scanner(System.in);
        System.out.print("M="); M=inp.nextInt();
        double[] y = new double[M];



        for (int i=0; i<M; i++)
        {
            System.out.print("y("+i+")=");
            y[i]=inp.nextDouble();

        }
        inp.close();

        for (int i=0; i<M; i++)
            S=S+y[i];

        Sr=S/M;


        for (int i=0; i<M; i+=2)
            if (y[i]<0)
                y[i]=Sr;

        System.out.println("Массив после замены:");

        for (int i=0; i<M; i++)
            System.out.println("y("+i+")="+y[i]);

        System.out.println();

        NewM=0;

        for (int i=0; i<M; i++)
            if (y[i]%2==0)
            {
                y[NewM]=y[i];
                NewM++;
            }

        M=NewM;
        if (M==0)
            System.out.println("Нет элементов.");
        else
            System.out.println("Массив после удаления нечетных элементов:");
        for (int i=0; i<M; i++)
            System.out.println("y("+i+")="+y[i]);
    }
}
