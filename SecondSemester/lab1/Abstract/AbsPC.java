package SecondSemester.lab1.Abstract;
// подкласс
    class AbsPC extends AbsComputer{
    private double heightCount; // поле
    public AbsPC (String n, String t, String o, double hc) { // конструктор
        super(n,t,o);
        heightCount = hc;
    }

    public double getHC() { // метод для чтения
        return heightCount;
    }
    public void setName(double hc) { // метод для записи
        heightCount = hc;
    }

    // метод для вывода
    @Override
    public String toString() {
        return getName() + ", " + getType() + ", " + getOS() + ", Высота: " + getHC() + " см";
    }

}
