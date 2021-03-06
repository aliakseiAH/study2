package day5;

public class Moto {
    private int yearOfProduction;
    private String color;
    private String model;

    public Moto() {
        this.yearOfProduction = 1900;
        this.color = "mud";
        this.model = "bike";
    }

    public Moto (int yearOfProduction, String color, String model) {
        this.yearOfProduction = yearOfProduction;
        this.color = color;
        this.model = model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
