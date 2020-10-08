package FirstSemester.lab9;
import java.util.Scanner;
public class Prog92 {
    public static int N,M;

    static void InputArray(String Namez) {
        double []z;

        Scanner inp = new Scanner(System.in);
        System.out.println("Ввод массива"+Namez);
        System.out.print("Число элементов= "); M=inp.nextInt();
        z=new double[M];
        for (int i=0; i<M; i++) {
            System.out.print(Namez+"("+i+")=");
            z[i]=inp.nextDouble();
        }
        inp.close();

    }

    static void FormNewArray(String Namey, double []z) {
        double[] y = new double[M];
        N=0;
        for (int i=0; i<M; i++)
            if (z[i]%2!=0)
            {y[N]=z[i];
                N++;
            }
        if (N==0)
            System.out.println("Нет элементов.");

    }

    static void PrintNewArray(double[] y, String Namey) {
        System.out.println("Массив "+Namey);
        for (int i=0; i<N; i++)
            System.out.printf("%S(%d)=%1.2f\n", Namey, i, y[i]);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        double z = InputArray("z");
//        double y = FormNewArray("y");
//        PrintNewArray(y, "y");

    }
}
