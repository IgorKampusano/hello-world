package SecondSemester.lab1.Interface;
// подкласс
public class IntPC extends IntComputer1{
    private double heightCount; // поле
    public IntPC (String n, String t, String o, double hc) { // конструктор
        super(n,t,o);
        heightCount = hc;
    }

    // метод для чтения

    public double getHC() {
        return heightCount;
    }

    // метод для записи

    public void setHC(double hc) {
        heightCount = hc;
    }

    // метод для вывода

    @Override
    public String toString() {
        return getName() + ", " + getType() + ", " + getOS() + ", " + getHC();
    }
}
