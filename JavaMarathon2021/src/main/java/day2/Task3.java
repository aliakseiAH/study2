package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите а");
        int a = sc.nextInt();
        System.out.println("Введите b");
        int b = sc.nextInt();
        int x;

        if (a>=b) {
            System.out.println("Некорректное значение");
        } else {

        for (x = a + 1; x < b; x++) {
            while (x % 5 == 0 && x % 10 != 0) {
                System.out.println(x);
                break;
            }
        }
    }
}
}