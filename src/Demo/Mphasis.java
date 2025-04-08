package Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mphasis {

    //aaaabbbbbbbcccddddeee
    //largest pallindrome in the substring : expected out put : bbbbbb


    public static void main(String[] args) {
        String str = "aaaabbbbbbbcccddddeee";

        System.out.println(largestPallindrome(str));


    }

    public static boolean isPallindrome(String str){

        boolean flag=false;
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)==str.charAt(str.length()-1-i)){
                flag=true;
                continue;
            }

            else{
                flag =false;
                break;
            }

        }
        return flag;
    }

    public static List<String> largestPallindrome(String str){

        List<String> list = new ArrayList<>();

        for (int i=0;i<str.length();i++){

            for (int j=i+1;j<str.length();j++){
                if(isPallindrome(str.substring(i,j-1))){
                    list.add(str.substring(i,j-1));
                }
            }

        }
        return list;
    }
}
