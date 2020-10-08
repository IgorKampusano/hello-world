package SecondSemester.lab4;

public class Computer {
    String name;
    String type;
    String OS;
    Integer price;
    Double count;
    Boolean isAvailable;


    public Computer(String n, String t, String o, Integer p, Double c, Boolean iA) {
        name = n;
        type = t;
        OS = o;
        price = p;
        count = c;
        isAvailable = iA;
    }


    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getOS() {
        return OS;
    }

    public Integer getPrice() {
        return price;
    }

    public Double getCount() {
        return count;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }
}
