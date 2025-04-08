package Recursion;

public class SumOfNumbersN {
    public static int sumOfN(int n) {
        if (n < 1) {
            return 0;
        }
        return n + sumOfN(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sumOfN(6));
    }
}
