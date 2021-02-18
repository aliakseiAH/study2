package day3;

// Реализовать программу, которая пока работает, принимает на вход
// от пользователя два числа - делимое и делитель. Для этих двух
// чисел программа рассчитывает результат деления и выводит его в
// консоль. Программа останавливает свою работу тогда, когда пользователь
// вводит 0 в качестве делителя.
//(для этих вещественных чисел необходимо использовать тип double
// и метод nextDouble() у Scanner’а соответственно).

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        for (;;){
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            if (y == 0) {
                break;
            }

            System.out.println(x + " " + y + " " + x / y);

        }  System.out.println("Ostanovka");
    }
}