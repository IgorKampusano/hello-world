package OOP_Denis.lab2;

public class Country {
    private String name;
    private double windPower;

    public Country(String n, double w) {
        name = n;
        w = windPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public double getWindPower() {
        return windPower;
    }

    public void setWindPower(double w) {
        windPower = w;
    }
}
