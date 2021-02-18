package day8;
// Создать строку, состоящую из чисел от 0 до 20000. Важно понимать,
// что это одна строка, полученная конкатенацией (“склеиванием”) чисел
// из диапазона через пробел (0 + “ “ + 1 + “ “ + 2 + … + 20000).
// После создания такой строки, вызов System.out.println() на этой строке
// должен вывести в консоль сразу все числа из диапазона:
// 0 1 2 3 4 5 6 7 8 9 10 11 12 … 19995 19996 19997 19998 19999 20000
// Для того, чтобы почувствовать разницу в производительности между конкатенацией
// обычных строк (класс String) и использовании StringBuilder, реализуйте описанную
// задачу этими двумя способами, замеряя время работы программы.

public class Task1 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        String string = " ";
        for (int i = 0; i < 20001; i++) {
            string = string + " " + i;
        }
        System.out.println(string);
        long elapsedTime = System.nanoTime() - startTime;

        long startTime1 = System.nanoTime();

        StringBuilder sb = new StringBuilder(" ");
        for (int i = 0; i<20001; i++) {
            sb.append(i + " ");
        }
        System.out.println(sb.toString());
        long elapsedTime1 = System.nanoTime() - startTime1;
        System.out.println("string lasted for " + elapsedTime/1000000);

        System.out.println("stringbuilder lasted for " + elapsedTime1/1000000);

    }

}