package day3;

//Реализовать программу, которая 5 раз запрашивает от пользователя
// два числа - делимое и делитель. Для этих двух чисел программа
// рассчитывает результат деления и выводит его в консоль.
// Если пользователь вводит 0 в качестве делителя, вместо того,
// чтобы останавливать работу цикла принудительно, мы пропускаем
// итерацию и выводим в консоль сообщение “Деление на 0”.
//Ключевое слово else использовать в этой программе нельзя.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i =0; i<5; i++) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            if (y == 0) {
                System.out.println("Деление на ноль");
                continue;
            }
            System.out.println(x + " " + y + " " + x/y);
        }

    }
}
