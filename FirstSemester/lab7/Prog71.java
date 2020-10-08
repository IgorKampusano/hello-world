package FirstSemester.lab7;
import java.util.Scanner;
public class Prog71 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double [][]x;
        int N,M,A,B,Imin;
        Scanner inp = new Scanner(System.in);
        System.out.print("N="); N=inp.nextInt();
        System.out.print("M="); M=inp.nextInt();
        System.out.print("A="); A=inp.nextInt();
        System.out.print("B="); B=inp.nextInt();
        x=new double[N][M];
        for (int i=0; i<N; i++)
            for (int j=0; j<M; j++)
            {
                System.out.print("x("+i+","+j+")=");
                x[i][j]=inp.nextDouble();
            }
        inp.close();







        for (int j=0; j<M; j++)
        {Imin=0;
            for (int i=1; i<N; i++)
            {if (x[i][j]<x[Imin][j])

                Imin=i;
                System.out.println("Минимальный элемент в " + j + " столбце  " + "x("+Imin+","+j+")=" + x[Imin][j]);
            }
            if ((x[Imin][j]>=A)&&(x[Imin][j]<=B))
                System.out.println(j);
        }






        System.out.println("Номера столбцов, в которых минимальный элемент попадает в интервал от " + A + " до " + B);



    }
}
