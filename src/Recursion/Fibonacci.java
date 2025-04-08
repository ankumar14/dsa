package Recursion;

public class Fibonacci {
    public static int getFibonacci(int n) {
        if (n == 1) {
            return 1;
        }
        if(n==0){
            return 0;
        }

        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(getFibonacci(100));
    }
}
