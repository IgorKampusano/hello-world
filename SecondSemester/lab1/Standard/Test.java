package SecondSemester.lab1.Standard;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {


        Computer comp[];
        int n = 9;
        int c = 0;
        String processor;


        // массив с базой компьютеров

        System.out.println("Стандартный класс.");
        // ввод типа процессора
        Scanner input = new Scanner(System.in);
        System.out.print("Тип процессора: "); processor = input.nextLine();
        input.close();

        comp = new Computer[n];
        comp[0] = new PC("Персональный", "Intel Core i9", "Windows", 25);
        comp[1] = new Laptop("Ноутбук", "Intel Core i5", "Windows", "Игровой");
        comp[2] = new PC("Ноутбук", "Intel Core 2 Duo", "Linux", 30);
        comp[3] = new PC("Персональный", "Intel Core i3", "Linux", 31);
        comp[4] = new Laptop("Ноутбук", "AMD Ryzen 7 1700", "MacOS", "Неигровой");
        comp[5] = new Laptop("Ноутбук", "Intel Celeron G3950", "Windows", "Неигровой");
        comp[6] = new PC("Персональный", "Intel Core i5", "MacOS", 28);
        comp[7] = new PC("Персональный", "AMD Ryzen 7 1700", "Windows", 36);
        comp[8] = new Laptop("Ноутбук", "Intel Core i5", "Linux", "Игровой");
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
