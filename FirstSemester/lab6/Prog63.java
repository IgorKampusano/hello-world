package FirstSemester.lab6;
import java.util.Scanner;
public class Prog63 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int N,M;
        boolean FlagSort;
        Scanner inp = new Scanner(System.in);
        System.out.print("M="); M=inp.nextInt();
        double[] z = new double[M];



        for (int i=0; i<M; i++)
        {
            System.out.print("z("+i+")=");
            z[i]=inp.nextDouble();

        }
        inp.close();

        double[] y = new double[M];
        N=0;
        for (int i=0; i<M; i++)
            if (z[i]%2!=0)
            {y[N]=z[i];
                N++;
            }

        if (N==0)
            System.out.println("Нет элементов.");

        do {
            FlagSort=true;
            for (int i=0; i<=N-2; i++)
                if (!(y[i]<=y[i+1]))
                {
                    double x=y[i];
                    y[i]=y[i+1];
                    y[i+1]=x;
                    FlagSort=false;
                }
        }while (FlagSort==false);

        for (int i=0; i<N; i++)
            System.out.println("y("+i+")="+y[i]);




    }
}
