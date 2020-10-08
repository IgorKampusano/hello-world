package SecondSemester.lab1.Abstract;
// подкласс
    class AbsLaptop extends AbsComputer{
    private String playable; // поле

    public AbsLaptop (String n, String t, String o, String p) { // конструктор
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
