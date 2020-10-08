package FirstSemester.lab8;
import java.util.Scanner;
import java.io.IOException;
public class Prog82 {
    private static boolean startsWith(char firstch) {
        // TODO Auto-generated method stub
        return false;
    }

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        final String Limits=" ,;!?().";
        final char firstch;


        String S;
        Scanner inp = new Scanner(System.in);
        System.out.print("S = "); S=inp.nextLine();
        System.out.print("Введите символ: "); firstch=(char)System.in.read();
        inp.close();

        int Bword,Eword;
        int i=0;
        while (i<S.length())
        {
            while ((i<S.length())&&(Limits.contains(Character.toString(S.charAt(i)))))
                i++;
            if (i<S.length())
            {
                Bword=i;
                i++;
                while ((i<S.length())&&(!(Limits.contains(Character.toString(S.charAt(i))))))
                    i++;
                Eword=i-1;
                int j=Bword;
                while ((j<=Eword)&&(startsWith(firstch)))
                    j++;
//                if (j>Eword)
//                {S=
//                }
            }
            i++;
        }
        System.out.println(S);






    }
}
