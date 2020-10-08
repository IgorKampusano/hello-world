package SecondSemester.lab1.Interface;
// интерфейс
public interface IntComputer {
    // поля

    String name = null;
    String type = null;
    String OS = null;

    //методы для чтения

    String getName();
    String getType();
    String getOS();

    // методы для записи

    void setName(String n);
    void setType(String t);
    void setOS(String o);
}
