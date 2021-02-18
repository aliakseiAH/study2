package day18;
//. Вам дан числовой массив произвольного размера. Посчитайте сумму чисел в
// этом массиве не используя циклы (необходимо использовать рекурсивные вызовы).
//Пример:
//int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
//System.out.println(recursionSum(...)); // 65346
//*recursionSum(...) - это ваш рекурсивный метод, который вернет сумму чисел в массиве numbers.
public class Task1 {
    public static void main(String[] args) {
        int [] numbers = {1,2,3};
        System.out.println(recursionSum(0, numbers));

    }
    static int recursionSum(int i, int[] A) {
        if (i== (A.length-1))
        {
        return A[i];
        }

        return A[i] + recursionSum(i+1, A);
    }
}
