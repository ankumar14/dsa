package String;

import java.util.*;

public class MaximumConsecutiveRepeatingCharacter {
    public static void main(String[] args) {
        System.out.println(MaximumConsecutiveRepeatingCharacter_M1("geeeeekkkk"));
    }

    public static char MaximumConsecutiveRepeatingCharacter_M1(String str) {

        char c = 'a';
        int count = 1;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                } else {
                    c = count > max ? str.charAt(i) : c;
                    max = Integer.max(max, count);
                    count = 0;
                    break;
                }
            }}
            return c;
        }
    }