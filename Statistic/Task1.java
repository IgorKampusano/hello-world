package Statistic;

public class Task1 {
    public static void main(String[] args) {
        int n = 30;
        double[] x = new double[]{
                0.819625033308245,
                0.395782597358694,
                8.25468802649838,
                0.362431246141871,
                1.83319047502874,
                9.30995430628878,
                5.11337446034282,
                2.41409240443736,
                0.173689676472167,
                0.142970767520721,
                7.39044839773972,
                0.119393115689768,
                0.175109812676339,
                2.89132861756695,
                0.891172106576642,
                7.81091589640195,
                3.45326322393746,
                0.352110735829931,
                0.931728566716554,
                0.165403427402720,
                1.68795937542402,
                13.3291100510501,
                0.654175202141846,
                0.273144280644256,
                1.55009711707708,
                1.10965915107991,
                1.18752384786468,
                3.74365790143548,
                1.68956282421395,
                7.06000230563140
        };

        double S1 = 0;

        for (int i = 0; i < n; i++) {
            S1 = S1 + x[i];
        }

        double xSr = S1/n; // математическое ожидание

        double S2x = 0;
        for (int i = 0; i < n; i++) {
            S2x = S2x + Math.pow(x[i] - xSr, 2);
        }

        S2x = S2x/(n-1); // дисперсия

        double Sx = Math.sqrt(S2x); // среднее квадратическое отклонение

        double CVx = Sx/xSr*100; // коэффициент вариации

        double m = 0;
        for (int i = 0; i < n; i++) {
            m = m + (x[i] - xSr);
        }

        m = m/n; // центральный момент

        double As = Math.pow(m, 3)/Math.pow(Sx, 3); // ассиметрия

        double Ex = (Math.pow(m, 4)/Math.pow(Sx, 4)) - 3; // эксцесс

        double Med; // медиана

        if (n%2 != 0) {
            Med = x[n/2];
        }
        else {
            Med = (x[n/2] + x[n/2 + 1])/2;
        }


        int Nmax = 0, Nmin = 0;

        for (int i = 1; i < n; i++) {
            if (x[i] > x[Nmax])
                Nmax = i;
        }

        for (int i = 0; i < n; i++) {
            if (x[i] < x[Nmin])
                Nmin = i;
        }

        double W = x[Nmax] - x[Nmin]; // размах

        System.out.println("Математическое ожидание = " + xSr);
        System.out.println("Дисперсия = " + S2x);
        System.out.println("Среднее квадратическое отклонение = " + Sx);
        System.out.println("Коэффициент вариации = " + CVx);
        System.out.println("Центральный момент = " + m);
        System.out.println("Ассиметрия = " + As);
        System.out.println("Эксцесс = " + Ex);
        System.out.println("Медиана = " + Med);
        System.out.println("Размах = " + W);






    }

}
