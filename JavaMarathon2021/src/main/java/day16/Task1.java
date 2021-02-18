package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException{
        printResult(new File("test1.txt"));

    }
    public static void printResult(File file) throws FileNotFoundException {
        double averageDoubleFull;
        String averageThreeDigits;
        double sum = 0;
        Scanner scanner = new Scanner(file);
        List<Double> numbersFromFile = new ArrayList<>();


        while (scanner.hasNextDouble()) {
            numbersFromFile.add(scanner.nextDouble());
        }

        for (double x:numbersFromFile) {
            sum = sum + x;
        }
        DecimalFormat df = new DecimalFormat("#.000000");
        averageDoubleFull = sum/numbersFromFile.size();
        averageThreeDigits = df.format(averageDoubleFull);

        System.out.println("Sum=" + sum + ", Average= " + averageDoubleFull + " , average 3 digits= " + averageThreeDigits );

    }
}

