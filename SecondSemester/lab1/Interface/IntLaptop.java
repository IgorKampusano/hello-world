package SecondSemester.lab1.Interface;
// подкласс
public class IntLaptop extends IntComputer1{
    private String playable; // поле
    public IntLaptop (String n, String t, String o, String p) { // конструктор
        super(n,t,o);
        playable = p;
    }

    public String getPlay() { // метод для чтения
        return playable;
    }

    public void setPlay(String p) { // метод для записи
        playable = p;
    }

    // метод для вывода

    @Override
    public String toString() {
        return getName() + ", " + getType() + ", " + getOS() + ", " + getPlay();
    }

}
