package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberOfSubArraysWithSumK {
    public static int findAllSubarraysWithGivenSum_M1(int arr[], int sum) {
        int n = arr.length; // size of the given array.
        Map<Integer, Integer> mpp = new HashMap();
        int preSum = 0;
        int cnt = 0;

        mpp.put(0, 1); // Setting 0 in the map.
        for (int i = 0; i < n; i++) {
            // add current element to prefix Sum:
            preSum += arr[i];

            // Calculate x-k:
            int remove = preSum - sum;

            // Add the number of subarrays to be removed:
            cnt += mpp.getOrDefault(remove, 0);

            // Update the count of prefix sum in the map.
            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }
        System.out.println(mpp);
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4,1,1,1,1,1,1};
        int sum = 6;
        findAllSubarraysWithGivenSum_M2(arr, sum);
    }

    private static void findAllSubarraysWithGivenSum_M2(int[] arr, int sum) {
        int curSum = 0;
        int start = 0;
        int end = -1;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            curSum += arr[i];

            if (curSum == sum) {
                start = 0;
                end = i;
                System.out.println(start + " , " + end);

            }
            if (map.containsKey(curSum - sum)) {
                start = map.get(curSum - sum) + 1;
                end = i;
                System.out.println(start + " , " + end);
            }
            map.put(curSum,i);
        }
        if (end == -1) {
            System.out.println("no such subarray found");
        }
    }
}
