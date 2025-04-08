package String;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {

        System.out.println(longestSubstringLength_M2("aabcdee"));
    }


    static int longestSubstringLength_M2(String str) {
        if(str.isEmpty()){
            System.out.println("empty or null");
        }
        int res = 0;
        int[] lastIndex = new int[26];
        Arrays.fill(lastIndex, -1);
        int start = 0;
        int n = str.length();
        int a =0;
        int b =0;
        // Move end of current window
        for (int end = 0; end < n; end++) {

            // Find the last index of s[end]
            // Update starting index of current window as
            // maximum of current value of end and last index + 1
            start = Math.max(start, lastIndex[str.charAt(end) - 'a'] + 1);

            // Update result if we get a larger window
            //res = Math.max(res, end - start + 1);

            if(res < end-start+1){
                res = end - start +1 ;
                 a = start;
                 b = end;
            }
            // Update last index of s[end]
            lastIndex[str.charAt(end) - 'a'] = end;
        }
        System.out.println(str.substring(a,b+1));
        return res;


    }
}
