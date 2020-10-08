package FirstSemester.lab7;
import java.util.Scanner;
public class Prog73 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double [][]x;
        int N,k;
        double S;
        Scanner inp = new Scanner(System.in);
        System.out.print("N="); N=inp.nextInt();
        x=new double[N][N];
        for (int i=0; i<N; i++)
            for (int j=0; j<N; j++)
            {
                System.out.print("x("+i+","+j+")=");
                x[i][j]=inp.nextDouble();
            }
        inp.close();

        S=0;
        k=0;
        for (int i=0; i<N; i++)
            for (int j=0; j<N; j++)
                if (x[i][j]<j)
                {
                    S+=x[i][j];
                    k++;
                }
        double Sr=0;
        if (k==0)
            System.out.println("Нет элементов.");
        else
        {
            Sr=S/k;
            System.out.printf("Sr=%1.4f", Sr);
        }
        System.out.println();
        System.out.println("Матрица до замены:");

        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++)
                System.out.printf("%6.2f", x[i][j]);
            System.out.println();
        }
        if (Sr==0)
            System.out.println("Нет среднего.");
        else
        {
            for (int i=1; i<N; i++)
                for (int j=0; j<i; j++)
                    x[i][j]=Sr;
        }
        System.out.println("Матрица после замены:");

        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++)
                System.out.printf("%6.2f", x[i][j]);

            System.out.println();
        }
    }
}
