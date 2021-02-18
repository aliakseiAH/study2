package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("VAZ");
        list.add("ZAZ");
        list.add("GAZ");
        list.add("URAL");
        list.add("KAMAZ");

        for (int i = 0; i< list.size(); i++)
            System.out.print(list.get(i) + " ");

        list.add(3, "MAZ");
        list.remove(0);

        for (int i = 0; i< list.size(); i++)
            System.out.println(list.get(i) + " ");


    }
}
