package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

//find the index of two numbers in an array whose sum is K
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 3, 1, 8, 9}; // 1,1,2,3,4,8,9
        int sum = 12;
        findTwoSumIndex_M1(arr, sum);//map approach
        //System.out.println(findTwoSumIndex_M2(arr, sum));//two pointer approach

    }

    private static List<Integer> findTwoSumIndex_M2(int[] arr, int sum) {
        int left = 0;
        int right = arr.length - 1;
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        while (left < right) {
            int currentSum = arr[left] + arr[right];
            if (currentSum == sum) {
                list.add(arr[left]);
                list.add(arr[right]);
                left++;
            } else if (currentSum > sum) {
                right--;
            } else if (currentSum < sum) {
                left++;
            }
            else {
                System.out.println("no such pair found");
            }
        }
      return list;
    }
    private static void findTwoSumIndex_M1(int[] arr, int target) { // TC - nlogn(ordered map ) O(n2) unordered map , SC - O(N)
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            int more = target - a;
            if (map.containsKey(more)) {
                System.out.println(i + "," + map.get(more));
            }
            map.put(a, i);
        }

        System.out.println(map);
    }
}
