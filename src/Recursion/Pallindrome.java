package Recursion;

public class Pallindrome {
    public static boolean isPallindrome(int i , int n,String s){
        if(i>=n/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(n-1)){
            return false;
        }
        return isPallindrome(i+1,n-1,s);
    }

    public static void main(String[] args) {
        String s = "madam";
        System.out.println(isPallindrome(0,s.length(),s));
    }
}
