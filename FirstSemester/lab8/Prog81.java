package FirstSemester.lab8;
import java.util.Scanner;
public class Prog81 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String S;
        int upperCase;
        Scanner inp = new Scanner(System.in);
        System.out.print("S= "); S=inp.nextLine();
        inp.close();

        upperCase=0;
        for (int i=0; i<S.length(); i++)
            if (Character.isUpperCase(S.charAt(i)))
                upperCase++;
        System.out.print("Количество прописных символов в строке: "+upperCase);

    }
}
