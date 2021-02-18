package day14;

import java.io.*;
import java.rmi.NotBoundException;
import java.util.Scanner;

// Создать .txt файл в папке проекта, как показано в видео (урок 36, время 15:30).
// Заполнить его вручную десятью произвольными числами. Реализовать статический
// метод printSumDigits(File file), который считает сумму всех чисел в этом файле
// и выводит ее на экран.
//Если файла не существует в папке проекта, в программе необходимо выбрасывать исключение
// и выводить в консоль сообщение “Файл не найден”. Помимо этого, если чисел в файле меньше
// или больше 10, необходимо выбрасывать исключение и выводить в консоль сообщение “Некорректный входной файл”.
//Вызвать данный метод в методе main().
public class Task1 {
    public static void main(String[] args) {


        printSumDigits(new File("test1.txt"));


    }

    public static void printSumDigits(File file) {


        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] x = line.split(" ");

            if (x.length != 10)
                    throw new IOException();
                    int[] y = new int[10];
                    int sum = 0;
                    for (int i = 0; i < x.length; i++) {
                        y[i] = Integer.parseInt(x[i]);
                        sum = sum + y[i];
                    }
                    System.out.println("Sum = " + sum);


        }

        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

                catch (IOException q) {
                    System.out.println("Incorrect file");
                }





    }
}

