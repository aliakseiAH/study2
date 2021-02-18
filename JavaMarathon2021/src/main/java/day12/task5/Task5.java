package day12.task5;

import day12.task5.MusicBand;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("dodik", 32));
        members1.add(new MusicArtist("Vasek", 35));

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("KOlyan", 45));
        members2.add(new MusicArtist("Gogi", 42));

   MusicBand band1 = new MusicBand("KOala", 1978, members1);
   MusicBand band2 = new MusicBand("drandulet", 2008, members2);

        System.out.println(band1.getMembers().toString());
        System.out.println(band2.getMembers().toString());

        MusicBand.transferMembers(band1, band2);
        band1.printMembers();
        band2.printMembers();
    }
}
