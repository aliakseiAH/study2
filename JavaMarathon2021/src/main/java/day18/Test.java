package day18;
//1.Дано натуральное число n. Выведите все числа от 1 до n.
public class Test {
    public static void main(String[] args) {
//        System.out.println(fac(4));
//    }
//
//    private static int fac(int n) {
//        if (n==1)
//            return 1;
//        return n*fac(n-1);
        System.out.println(numbersOneN(3));

    }
    public static String numbersOneN (int n) {
        if (n==1) {
            return "1";
        }
      return numbersOneN(n-1) + " "  + n;
    }

}
