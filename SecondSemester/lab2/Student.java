package SecondSemester.lab2;

public class Student {
    private String fio;
    private double height;
    public Student(String f, double h) {
        fio = f;
        height = h;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String f){
        fio = f;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double h){
        height = h;
    }
}
