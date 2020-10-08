package SecondSemester.lab1.Standard;
// подкласс
public class PC extends Computer{
    private double heightCount; // поле
    public PC (String n, String t, String o, double hc) { // констуктор
        super(n,t,o);
        heightCount = hc;
    }

    public double getHC() { // метод для чтения
        return heightCount;
    }
    public void setHC(double hc) { // метод для записи
        heightCount = hc;
    }

    // метод для вывода
    @Override
    public String toString() {
        return getName() + ", " + getType() + ", " + getOS() + ", Высота: " + getHC() + " см";
    }
}
