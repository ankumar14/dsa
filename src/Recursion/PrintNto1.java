package Recursion;

public class PrintNto1 {
    public static void print(int i, int n){
        if(i==0){
            return;
        }
        System.out.println(n);
        i--;
        print(i,n);
    }

    public static void main(String[] args) {
        print(5,5);
    }
}
