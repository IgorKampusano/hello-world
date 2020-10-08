package FirstSemester.lab2;
import java.util.Scanner;
public class Prog22 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double a,y;
        Scanner inp = new Scanner(System.in);
        System.out.print("a="); a=inp.nextDouble();
        inp.close();

        switch ((a<-10)||((a>=1)&&(a<=8))?1:0) {
            case 1:y=1-a*a; break;
            default:switch (((a>=16)&&(a<=40))||(a==59)||(a==65)?1:0) {
                case 1:y=Math.sqrt(Math.pow(a, 3)-2)+15; break;
                default:switch (((a>=-8)&&(a<=-2))||(a==50)||(a==60)?1:0) {
                    case 1:y=Math.sin(a-3); break;
                    default:y=a-10;
                }
            }
        }
        System.out.printf("y=%1.4f", y);

    }
}
