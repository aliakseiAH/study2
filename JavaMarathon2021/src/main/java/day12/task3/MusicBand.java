package day12.task3;

public class MusicBand {
    private int year;
    private String name;

    public MusicBand(int year, String name) {
        this.year = year;
        this.name = name;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "year=" + year +
                ", name='" + name + '\'' +
                '}';
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }
}

