package FirstSemester.lab6;
import java.util.Scanner;
public class Prog61 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int N,M=0,count=0;
        double y;

        Scanner inp = new Scanner(System.in);
        System.out.print("N="); N=inp.nextInt();
        double[] x = new double[N];



        for (int i=0; i<N; i++)
        {
            System.out.print("x("+i+")=");
            x[i]=inp.nextDouble();

        }
        inp.close();

        for (int i=0; i<N; i++)
            if (x[i]>0)
                M++;
        System.out.println();
        if (M>0)
            System.out.println("Количество положительных элементов: " + M);
        else
            System.out.println("Нет положительных элементов.");
        System.out.println();
        y=0;
        for (int i=0; i<N; i++)
        {y=x[i]-(int)x[i];
            if (y!=0)
            {count++;
                System.out.println("x("+i+")="+x[i]);
            }
        }
        if (count==0)
            System.out.println("Нет элементов с дробной частью.");
    }
}
