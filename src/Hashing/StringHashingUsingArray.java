package Hashing;

import java.util.Arrays;

public class StringHashingUsingArray {
    public static void main(String[] args) {
        String s = "aaabdefzdddnyrio";
        char[] required = {'c', 'a', 'f', 'd', 'e', 'p'};
        findCharCount(required, s);
    }

    private static void findCharCount(char[] required, String s) {
        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a'] += 1;
        }
        System.out.println(Arrays.toString(hash));
        int[] count = new int[required.length];
        for (int i = 0; i < required.length; i++) {
            count[i] = hash[required[i] - 'a'];
        }
        System.out.println(Arrays.toString(count));
    }

}
