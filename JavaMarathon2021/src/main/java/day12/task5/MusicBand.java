package day12.task5;

import java.util.List;

public class MusicBand {
    private int year;
    private String name;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.year = year;
        this.name = name;
        this.members = members;
        }


    @Override
    public String toString() {
        return "MusicBand{" +
                "year=" + year +
                ", name='" + name + '\'' +
                ", members=" + members +
                '}';
    }

    public int getYear() {
        return year;
    }
    public String getName() {
        return name;
    }
    public List<MusicArtist> getMembers() {return members;}

    public void printMembers () {
        System.out.println(getMembers().toString());
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }

    public static void transferMembers(MusicBand band1, MusicBand band2) {
        band2.members.addAll(band1.getMembers());
        band1.members.clear();


    }
}

