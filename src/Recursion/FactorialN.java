package Recursion;

public class FactorialN {
    public static int getFactorial(int n){
        if(n<1){
            return 1;
        }
        return n * getFactorial(n-1);
    }

    public static void main(String[] args) {
        System.out.println(getFactorial(5));
    }
}
