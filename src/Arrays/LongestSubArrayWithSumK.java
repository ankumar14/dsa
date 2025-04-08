package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

//find the longest sub array whose sum is 3
public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 2};
        //System.out.println(longestSubArrayWithSumK_M3(arr,6));


        System.out.println(longestSubArrayWithSumK_M1(arr, 6));
        //System.out.println(longestSubArrayWithSumK_M2(arr, 6));
    }

    private static int longestSubArrayWithSumK_M2(int[] arr, int K) { //TC - O(n2)
        int left = 0;
        int right = 0;
        int length = 0;
        int sum = 0;
        while (right < arr.length) {
            while (sum > K && left <= right) {
                sum -= arr[left];
                left++;
            }
            if (sum == K) {
                length = Integer.max(length, right - left + 1);
            }
            right++;
            if (right < arr.length) {
                sum += arr[right];
            }
        }
        return length;

    }

    private static int longestSubArrayWithSumK_M1(int[] arr, int K) {//TC- NlogN if ordered map else N2 , SC - N
        int prefixSum = 0;
        int maxLen = 0;

        //create a map to store the <sum,count> values
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            //fill the map with prefixSum values and count of length
            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }

            //if prefix sum = target sum then find out the max length between current value of length and previous
            if (prefixSum == K) {
                maxLen = Integer.max(maxLen, i + 1);
            }

            //tricky part
            else if (map.containsKey(prefixSum - K)) {
                maxLen = Math.max(
                        maxLen,
                        i - map.get(prefixSum - K));

            }


        }
        System.out.println(map);
        return maxLen;
    }

    private static int longestSubArrayWithSumK_M3(int[] arr,int k){

        int count =0;
        int sum =0;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k){
                count++;
                System.out.println(0 + "," + i);
            }
            else if(map.containsKey(sum-k)){
                count++;
                System.out.println(map.get(sum-k) + "," + i);
            }


            map.put(sum,i);

        }

        System.out.println(map);
        return count;
    }

}
