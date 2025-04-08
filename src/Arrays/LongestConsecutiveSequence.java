package Arrays;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] a = {100, 200, 1, 2, 3, 4, 1};
        //int ans = longestSuccessiveElements(a);
        //System.out.println("The length of longest consecutive sequence is " + ans);

        int ans = longestSuccessiveElementsM1(a);
        System.out.println("The length of longest consecutive sequence is " + ans);
    }
    public static int longestSuccessiveElements(int[] a) { // TC - O(n2) , SC - O(n)
        int n = a.length;
        if (n < 2)
            return n;

        int longest = 1;
        Set<Integer> set = new HashSet<>();

        // put all the array elements into set
        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }

        // Find the longest sequence
        for (int it : set) {
            // if 'it' is a starting number
            if (!set.contains(it - 1)) {
                // find consecutive numbers
                int cnt = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }


    public static int longestSuccessiveElementsM1(int[] a){

        int count = 1;
        int max = 0;

        for(int i=0;i<a.length-1;i++){
            if(a[i+1]-a[i]==1){
               count++;
            }
            else {
                max = Math.max(max,count);
                count=1;
            }
        }
        return max;
    }

}
