package SecondSemester.lab1.Abstract;
// обычный класс с абстрактными методами
public class AbsComputer1 extends AbsComputer {
    public AbsComputer1(String n, String t, String o) { // конструктор
        super(n, t, o);
    }

    // метод для вывода

    public String toString() {
        return getName() + ", " + getType() + ", " + getOS();
    }
}
