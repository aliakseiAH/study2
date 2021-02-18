package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Реализовать программу, записывающую числа разных типов в 2 файла.
//Файл 1 должен называться “file1.txt”, а Файл 2 должен называться “file2.txt”.
//Оба файла должны находиться в корне проекта. Создаваться файлы должны не вручную, а при запуске программы.
//Файл 1 должен содержать 1000 случайных чисел от 0 до 100.
//Файл 2 создается на основании Файла 1, но содержит числа вещественного типа данных.
//Метод заполнения Файла 2 следующий: для каждой группы из 20 целых чисел из Файла 1 рассчитывается их среднее арифметическое.
// Затем, полученное значение записывается в Файл 2. Таким образом в Файле 2 будет находиться 50 вещественных чисел (1000 / 20 = 50).
//После того, как Файл 2 будет сформирован, необходимо реализовать статический метод printResult(File file).
// Этот метод должен рассчитать сумму всех вещественных чисел из Файла 2 и вывести её в консоль, отбросив вещественную часть.
//Пример:
//Для простоты, в Файле 1 находится 12 целых чисел, а среднее арифметическое рассчитывается для группы из 4 целых чисел.
//Файл 1: 3 8 7 5 28 73 4 1 5 32 89 12
//Файл 2: 5.75 26.5 34.5
//Ответ: 66
//Комментарии к примеру:
//Среднее арифметическое для четверки 3 8 7 5 равно 5.75
//Таким же образом рассчитаны средние арифметические для остальных четверок из Файла 1.
//Сумма вещественных чисел из Файла 2 равняется 66.75
//Отбросив вещественную часть (числа после запятой) получаем ответ 66.
public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw1 = new PrintWriter("file1.txt");
        List<Integer> numbers1 = new ArrayList<>();
        List<Double> numbers2 = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            numbers1.add((int)(Math.random() * 100));
            pw1.print(numbers1.get(i) + " ");
        }
        pw1.close();

        Scanner sc = new Scanner("file1.txt");
        PrintWriter pw2 = new PrintWriter("file2.txt");

    //029 8875805 Сергей

        sc.close();
        System.out.println("Numbers1 = " + numbers1.toString());
        for (int i = 0; i < numbers1.size(); i = i + 20) {
            double averageTemp = 0;
            for (int j = 0; j < 20; j++) {
                averageTemp = averageTemp + numbers1.get(i + j);
            }
            numbers2.add(averageTemp/20);
        }
        for (int i = 0; i< numbers2.size(); i++) {
        pw2.print(numbers2.get(i) + " ");
        }

        pw2.close();
        System.out.println("Numbers2= " + numbers2.toString());

        printResultFile(new File("file2.txt"));

    }
    public static void printResultFile (File file) throws FileNotFoundException {
        Scanner sc = new Scanner(file);

        List<Double> numbers3 = new ArrayList<>();
        String[] doubleTemp = new String[20];
        while (sc.hasNext()) {
         doubleTemp = sc.nextLine().split(" ");
        }

        double sum = 0;
        for (int i = 0; i < doubleTemp.length; i++ ) {
            numbers3.add(Double.parseDouble(doubleTemp[i]));
            }
        System.out.println("Temp array for split" + doubleTemp);
        System.out.println("Numbers3 = " + numbers3.toString());
        for (int i = 0; i < numbers3.size(); i++ ) {
            sum = (int) (sum + numbers3.get(i));
        }

       System.out.println("Sum = " + sum);

    }

}