package OOP_Denis.lab4;

public class Ship {
    //поля класса

    String name; //название корабля
    Integer pass; //пассажировместимость
    Double disp; //водоизмещение
    Double length; //длина корабля
    Double speed; //скорость
    Boolean isRus; //российское судно


    //конструктор

    public Ship(String n, Integer p, Double d, Double l, Double s, Boolean iR) {
        name = n;
        pass = p;
        disp = d;
        length = l;
        speed = s;
        isRus = iR;
    }

    // методы для чтения

    public String getName() {
        return name;
    }

    public Integer getPass() {
        return pass;
    }

    public Double getDisp() {
        return disp;
    }

    public Double getLength() {
        return length;
    }

    public Double getSpeed() {
        return speed;
    }

    public Boolean getIsRus() {
        return isRus;
    }
}
