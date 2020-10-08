package SecondSemester.lab1.Interface;
// класс, реализующий интерфейс
public class IntComputer1 implements IntComputer{
    // поля

    private String name = null;
    private String type = null;
    private String OS = null;



    // конструктор

    public IntComputer1(String n, String t, String o) {
        name = n;
        type = t;
        OS = o;
    }

    // методы для чтения

    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public String getOS() {
        return OS;
    }

    // методы для записи

    public void setName(String n) {
        name = n;
    }
    public void setType(String t) {
        type = t;
    }
    public void setOS(String o) {
        OS = o;
    }

    //метод для вывода

    public String toString() {
        return getName() + ", " + getType() + ", " + getOS();
    }
}
