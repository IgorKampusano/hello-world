package FirstSemester.lab2;
import java.util.Scanner;
public class Prog23 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double a,b,min,max,minx,maxx,x1,x2,x3,x4,x5,y;
        Scanner inp = new Scanner(System.in);
        System.out.print("x1="); x1=inp.nextDouble();
        System.out.print("x2="); x2=inp.nextDouble();
        System.out.print("x3="); x3=inp.nextDouble();
        System.out.print("x4="); x4=inp.nextDouble();
        System.out.print("x5="); x5=inp.nextDouble();
        inp.close();

        maxx=x1;
        if (x2>maxx) maxx=x2;
        min=maxx;
        if (x3<min) min=x3;
        if (x4<min) min=x4;
        if (x5<min) min=x5;
        a=min;
        minx=x3;
        if (x4<minx) minx=x4;
        max=x1;
        if (x2>max) max=x2;
        if (minx>max) max=minx;
        if (x5>max) max=x5;
        b=max;
        if (2*b+a!=0) {
            if (((3*a-4*b)/(2*b+a))>=0) {
                y=Math.sqrt((3*a-4*b)/(2*b+a));
                System.out.printf("y=%1.4f", y);
            }

            else System.out.print("Подкоренное выражение меньше нуля.");
        }
        else System.out.print("Нуль в знаменателе.");






    }
}
