package day6;

public class Auto {

    private int yearOfProduction;
    private String color;
    private String model;

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void info() {
        System.out.println("this is auto");
    }

    public Integer yearDifference(int inputYear) {
        if (inputYear>=yearOfProduction) {
            return (inputYear-yearOfProduction);
        } else return null;


        }
    }
