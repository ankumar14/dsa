package Recursion;

public class PrintNameNTimes {
    public static void printName(int i , int n){
        if(i>n){
            return;
        }
        System.out.println("Anuj");
        i++;
        printName(i,n);
    }

    public static void main(String[] args) {
        printName(4,6);
    }
}
