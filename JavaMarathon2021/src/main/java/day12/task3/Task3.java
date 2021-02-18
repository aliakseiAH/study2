package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Task3 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand(1994, "jopaJona");
        MusicBand band2 = new MusicBand(1996, "jopaKarla");
        MusicBand band3 = new MusicBand(1945, "jopaSida");
        MusicBand band4 = new MusicBand(1998, "jopaKoli");
        MusicBand band5 = new MusicBand(2014, "jopaSashi");
        MusicBand band6 = new MusicBand(2014, "jopaLeny");
        MusicBand band7 = new MusicBand(2011, "jopaMarsa");
        MusicBand band8 = new MusicBand(2015, "jopa");
        MusicBand band9 = new MusicBand(2020, "jopa2");
        MusicBand band10 = new MusicBand(1999, "jopa3");

        List<MusicBand> list = new ArrayList<>();
        Collections.addAll(list, band1, band2, band3, band4, band5, band6, band7, band8, band9, band10);
        Collections.shuffle(list);
        System.out.println(list.toString());

        System.out.println(groupsAfter2000(list).toString());
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> listAbove2000 = new ArrayList<>();
        for (int i = 0; i < bands.size(); i++) {
            if (bands.get(i).getYear() >= 2000)
                listAbove2000.add(bands.get(i));
        }
        return listAbove2000;
    }
}