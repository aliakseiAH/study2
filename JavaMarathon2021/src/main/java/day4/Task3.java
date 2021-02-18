package day4;

//Заполнить двумерный массив (матрицу) случайными числами от 0 до 50.
// Размер матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
// В консоль вывести индекс строки, сумма чисел в которой максимальна.
// Если таких строк несколько, вывести индекс последней из них.
//Пример сгенерированной матрицы (для простоты m=3, n=5):
//
//3 2 1 5 7 	// сумма - 18
//1 2 5 6 2 	// сумма - 16
//3 4 9 6 4	// сумма - 26
//
//Ответ: 2 (индекс строки, сумма чисел в которой максимальна)

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        int[][] numb = new int[12][8];
        int max = 0;
        int x = 0;
        for (int i=0; i< numb.length;i++) {
            int sum = 0;

            for (int j = 0;j< numb[i].length; j++){
                numb[i][j] = (int) (Math.random()*51);
                sum = sum + numb[i][j];
                System.out.print(numb[i][j] + " ");
            }
            System.out.println("сумма = " + sum);
            System.out.println();
            if (sum>=max) {
                max = sum;
                x = i;}
        }
        System.out.println("max = " + max);
        System.out.println("otvet = " + x);



        }
    }

