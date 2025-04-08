package CodingExercise;

//Find whether the string is a permutation of a palindrome

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Find the count of chars and store it in haspMap
//If count of more than one char is odd - it is not a permutation of a palindrome
public class PalindromePermutation {

    public static void main(String[] args) {
        System.out.println(isPermutationPalindrome("aataacccdaaaa"));
    }

    public static boolean isPermutationPalindrome(String input) {

        //store the count of characters in this array charCount
        //keeping length 128 assuming all the characters can be part of the input
        int[] charCount = new int[256];

        //converting string to character array
        char[] chars = input.toCharArray();

        int oddCount = 0;

        //finding the char count and storing/increasing the count in charCount array
        for (int i = 0; i < chars.length; i++) {
            int charValue = chars[i];
            charCount[charValue]++;
        }

        //print the non-zero counts of the charCount array - not needed in real time - it is just an easy view of charCount array
        for (int i : charCount){
            if(i>0){
                System.out.print(i + " ");
            }
        }

        System.out.println(" ");

        //finding if more than one char has an odd count

        for (int i : charCount) {
            if (i % 2 != 0) {
                oddCount++;
            }
        }

        System.out.println("oddCount = " + oddCount);
        //if oddCount > 1 then it is not a permutation of a palindrome
        if (oddCount > 1) {
            return false;
        } else {
            return true;
        }
    }

}
