package Recursion;

public class Print1ToN {
    public static void print(int i , int n){
        if(i>n){
            return;
        }
        System.out.println(n);
        i++;
        print(i,n);
    }

    public static void main(String[] args) {
        print(1,10);
    }
}
