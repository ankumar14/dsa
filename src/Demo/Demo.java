package Demo;

import java.util.*;

public class Demo {
    public static void main(String[] args) {

        System.out.println(findTheLongestSubstringPallindrome("babad"));
    }

    private static String findTheLongestSubstringPallindrome(String str) {

        int n = str.length();

        if(n<2){
            return str;
        }

        int maxLength =0;
        int start =0;

        for (int i=0;i<n;i++){

            //to cover cases where my substring can be an odd one or an even one

            for(int j=0;j<=1;j++){ //j=0 then b will be taken , j=1 ba will be taken
                int low=i; //for odd cases
                int high = i+j; //for even cases

                //iterating left and right in case characters match
                while (low>=0 && high<n && str.charAt(low)==str.charAt(high)){
                    int currentLength = high-low +1;
                    if(currentLength>maxLength){
                        start=low;
                        maxLength=currentLength;
                    }
                    low--;
                    high++;
                }

            }
        }
//        System.out.println(maxLength);
//
//        System.out.println(start);
//        System.out.println(maxLength);
        //return str;
        return str.substring(start,start+maxLength);
    }
}


//Given a string s, return the longest
//palindromic substring in s.
//
//Example 1:
//
//Input: s = "babad"
//Output: "bab"
//Explanation: "aba" is also a valid answer.

