package Demo;

import java.util.*;

public class Demo1 {

    public static void main(String[] args)
    {
        int[] arr = { 2, 12, -2, -20, 10,-1,-9 };
        int n = arr.length;
        int sum = -10;

        // Function call
        System.out.println(subArraySum(arr, n, sum));

    }

    public static List<List<Integer>> subArraySum(int[] arr, int n,
                                   int sum)
    {

        List<List<Integer>> list = new ArrayList<>();
        // cur_sum to keep track of cumulative sum till that
        // point
        int cur_sum = 0;
        int start = 0;
        int end = -1;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            cur_sum = cur_sum + arr[i];
            // check whether cur_sum - sum = 0, if 0 it
            // means the sub array is starting from index 0-
            // so stop
            if (cur_sum - sum == 0) {
                start = 0;
                end = i;
                List<Integer> list1 = new ArrayList<>(2);
                list1.add(start);
                list1.add(end);
                list.add(list1);

            }
            // if hashMap already has the value, means we
            // already
            // have subarray with the sum - so stop
            if (hashMap.containsKey(cur_sum - sum)) {
                start = hashMap.get(cur_sum - sum) + 1;
                end = i;
                List<Integer> list1 = new ArrayList<>(2);
                list1.add(start);
                list1.add(end);
                list.add(list1);
            }
            // if value is not present then add to hashmap
            hashMap.put(cur_sum, i);
        }
        // if end is -1 : means we have reached end without
        // the sum
        if (end == -1) {
            System.out.println(
                    "No subarray with given sum exists");
        }
        else {
            System.out.println("Sum found between indexes "
                    + start + " to " + end);
        }
        return list;
    }

    // Driver code

}
