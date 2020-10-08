package FirstSemester.lab2;
import java.util.Scanner;
public class Prog21 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double a,y;
        Scanner inp = new Scanner(System.in);
        System.out.print("a="); a=inp.nextDouble();
        inp.close();

        if ((a<-10)||((a>=1)&&(a<=8)))
            y=1-a*a;
        else if (((a>=16)&&(a<=40))||(a==59)||(a==65))
            y=Math.sqrt(Math.pow(a, 3)-2)+15;
        else if (((a>=-8)&&(a<=-2))||(a==50)||(a==60))
            y=Math.sin(a-3);
        else y=a-10;
        System.out.printf("y=%1.4f", y);


    }
}
