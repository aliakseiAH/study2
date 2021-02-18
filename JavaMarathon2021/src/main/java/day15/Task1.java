package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args)  {
        try {
            Scanner scanner = new Scanner(new File("shoes.csv"));

            List<Shoe> shoesTemp = new ArrayList<>();
            String[] shoe1 = new String[3];
            List<Shoe> missingShoes = new ArrayList<>();
            while (scanner.hasNextLine()) {
                shoe1 = scanner.nextLine().split(";");
                Shoe shoe = new Shoe(shoe1);
                shoesTemp.add(shoe);
            }
            for (int i = 0; i < shoesTemp.size(); i++) {
                if (shoesTemp.get(i).getQuantity() == 0) {
                    missingShoes.add(shoesTemp.get(i));
                }
                scanner.close();

                try {
                File file2 = new File("missing_shoes.txt");
                PrintWriter pw = new PrintWriter(file2);
                pw.println("123");

                for (int z = 0; z < missingShoes.size(); z++) {
                    pw.println(missingShoes.get(z).toString());
                }
                pw.close();
                }catch (FileNotFoundException a) {
                    System.out.println("File not found in the end");
            }
        }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found in the very beginning");
        }


        //System.out.println(missingShoes.toString());



    }
}

