package day4;

// Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
//Затем, используя циклы for each вывести в консоль:
//наибольший элемент массива
//наименьший элемент массива
//количество элементов массива, оканчивающихся на 0
//сумму элементов массива, оканчивающихся на 0
//
//Использовать сортировку запрещено.

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] numb = new int[10];
        for (int i = 0; i<numb.length; i++) {
            numb[i] = (int) (Math.random()*1001);
//            System.out.print(numb[i] + " ");
        }
        System.out.println(Arrays.toString(numb));

        int max = numb[0];
        int min = numb[0];
        int sum = 0;
        int counter = 0;
        for (int x:numb) {
            if (x >= max)
                max = x;
            if (x <= min)
                min = x;
            if (x%10==0) {
                sum = sum + x;
                counter++;
            }
        }
        System.out.println("наибольший элемент массива = " + max);
        System.out.println("наименьший элемент массива = " + min);
        System.out.println("количество элементов массива, оканчивающихся на 0 = " + counter);
        System.out.println("сумму элементов массива, оканчивающихся на 0 = " + sum);

    }
}
