package FirstSemester.lab9;
import java.util.Scanner;
public class Prog91 {
    public static int N;

    static double [] InputArray(String Namex) {
        double []x;

        Scanner inp = new Scanner(System.in);
        System.out.println("Ввод массива"+Namex);
        System.out.print("Число элементов= "); N=inp.nextInt();
        x=new double[N];
        for (int i=0; i<N; i++) {
            System.out.print(Namex+"("+i+")=");
            x[i]=inp.nextDouble();
        }
        inp.close();
        return x;
    }

    static int SumPositive(double[]x) {
        int M=0;
        double y=0;
        for (int i=0; i<N; i++)
            y=x[i]-(int)x[i];
        if (y==0)
            System.out.println("Нет элементов с дробной частью.");
        else
            M++;
        System.out.println("Количество положительных элементов с дробной частью "+M);
        return M;
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        double x = InputArray("x");
//        SumPositive();


    }
}
