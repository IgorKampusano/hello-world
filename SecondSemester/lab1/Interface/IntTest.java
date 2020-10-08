package SecondSemester.lab1.Interface;
import java.util.Scanner;
public class IntTest {
    public static void main(String[] args) {

        IntComputer1 comp[];
        int n = 9;
        int c = 0;
        String processor;

        // массив с базой компьютеров

        System.out.println("Интерфейс.");
        // ввод типа процессора
        Scanner input = new Scanner(System.in);
        System.out.print("Тип процессора: "); processor = input.nextLine();
        input.close();

        comp = new IntComputer1[n];
        comp[0] = new IntPC("Персональный", "Intel Core i9", "Windows", 25);
        comp[1] = new IntLaptop("Ноутбук", "Intel Core i5", "Windows", "Игровой");
        comp[2] = new IntPC("Ноутбук", "Intel Core 2 Duo", "Linux", 30);
        comp[3] = new IntPC("Персональный", "Intel Core i3", "Linux", 31);
        comp[4] = new IntLaptop("Ноутбук", "AMD Ryzen 7 1700", "MacOS", "Неигровой");
        comp[5] = new IntLaptop("Ноутбук", "Intel Celeron G3950", "Windows", "Неигровой");
        comp[6] = new IntPC("Персональный", "Intel Core i5", "MacOS", 28);
        comp[7] = new IntPC("Персональный", "AMD Ryzen 7 1700", "Windows", 36);
        comp[8] = new IntLaptop("Ноутбук", "Intel Core i5", "Linux", "Игровой");
        for (int i=0; i<n; i++) {
            if (comp[i].getOS().equals("Windows") == true) { // проверка на наличие ОС Windows
                c++;
            }
            if (comp[i].getType().equals(processor)) { // проверка на наличие процессора
                System.out.println(comp[i].toString());
            }

        }
        System.out.println("Число компьютеров с установленной операционной системой Windows: " + c);

    }
}
