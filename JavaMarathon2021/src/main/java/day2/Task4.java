package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите x");
        double x = sc.nextDouble();


        if (x>=5) {
            System.out.println("y = " + ((x*x-10)/(x+7)));
        } else if (x>-3 && x<5) {
            System.out.println("y = " + ((x+3)*(x*x - 2)));
        } else System.out.println("y = 420");

    }
}
