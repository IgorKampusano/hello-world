package SecondSemester.lab1.Abstract;
// абстрактный класс
public abstract class AbsComputer {
    // поля

    private String name;
    private String type;
    private String OS;


    // конструктор

    public AbsComputer(String n, String t, String o) {
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

    public void setName (String n) {
        name = n;
    }
    public void setType (String t ) {
        type = t;
    }
    public void setOS (String o) {
        OS = o;
    }

    // метод для вывода

    public abstract String toString();
}
