package day4;

//С клавиатуры вводится число n - размер массива. Необходимо создать массив
// указанного размера и заполнить его случайными числами от 0 до 10. Затем
// вывести содержимое массива в консоль, а также вывести в консоль информацию о:
//а) Длине массива
//б) Количестве чисел больше 8
//в) Количестве чисел равных 1
//г) Количестве четных чисел
//д) Количестве нечетных чисел
//е) Сумме всех элементов массива

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vvedi n");
        int n = sc.nextInt();
        int[] numb = new int[n];


        for (int i = 0; i < n; i++) {
            numb[i] = (int) (Math.random()*(11));
            System.out.print(numb[i] + " ");;
        }
        System.out.println("\ndlina massiva =" + numb.length);

        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum+numb[i];
            if (numb[i] > 8)
                counter1++;

            if (numb[i] == 1)
                counter2++;

            if (numb[i]%2 ==0)
                counter3++;

            if (numb[i]%2!=0)
                counter4++;
            }

        System.out.println("Kolichestvo bolshe 8 = " + counter1 +"\nKol chisel ravnyh 1 = " + counter2 + "\nKolichestvo chetnyh = " + counter3 + "\nKolichestvo nechetnyh = " + counter4 + "\nSumma = " + sum);
    }
}
