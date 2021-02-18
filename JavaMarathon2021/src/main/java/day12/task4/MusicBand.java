//package day12.task4;
//
//import day12.task5.MusicArtist;
//
//import java.util.List;
//
//public class MusicBand {
//    private int year;
//    private String name;
//    private List<String> members;
//
//    public MusicBand(String name, int year, List<MusicArtist> members) {
//        this.year = year;
//        this.name = name;
//        ;
//        }
//
//
//
//    @Override
//    public String toString() {
//        return "MusicBand{" +
//                "year=" + year +
//                ", name='" + name + '\'' +
//                ", member='" + members + '\'' +
//                '}';
//    }
//
//    public int getYear() {
//        return year;
//    }
//    public String getName() {
//        return name;
//    }
//    public List<String> getMembers() {return members;}
//
//    public void printMembers () {
//        System.out.println(getMembers());
//    }
//
//    public void setMembers(List<String> members) {
//        this.members = members;
//    }
//
//    public static void transferMembers(MusicBand band1, MusicBand band2) {
//        band2.members.addAll(band1.getMembers());
//        band1.setMembers(null);
//
//
//    }
//}
//
