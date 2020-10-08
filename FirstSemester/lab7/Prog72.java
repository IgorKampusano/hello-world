package FirstSemester.lab7;
import java.util.Scanner;
public class Prog72 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double [][]x;
        double []y;
        int N,M;
        Scanner inp = new Scanner(System.in);
        System.out.print("N="); N=inp.nextInt();
        System.out.print("M="); M=inp.nextInt();
        x=new double[N][M];
        for (int i=0; i<N; i++)
            for (int j=0; j<M; j++)
            {
                System.out.print("x("+i+","+j+")=");
                x[i][j]=inp.nextDouble();
            }
        inp.close();


        int Ny=0;
        y=new double[N];
        for (int i=0; i<N; i+=2)
        {
            double P=1;
            for (int j=0; j<M; j++)
                if (x[i][j]%2==0)
                    P*=x[i][j];

            if (P%2==0)
            {y[Ny]=P;
                Ny++;
            }


        }

        if (Ny==0)
            System.out.println("Нет элементов.");
        System.out.println("Исходная матрица:");
        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++)
                System.out.printf("%7.2f", x[i][j]);
            System.out.println();
        }

        System.out.println("Сформированный массив:");
        for (int i=0; i<Ny; i++)
            System.out.println("y("+i+")="+y[i]);

    }
}
