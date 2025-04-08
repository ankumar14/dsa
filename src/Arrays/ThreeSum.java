package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//return unique triplets whose sum = K
//arr[i] + arr[left] + arr[right] == sum
public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8,11};
        int sum = 22;
        System.out.println(findThreeSum(arr,sum));
    }

    private static List<List<Integer>> findThreeSum(int[] arr, int sum) { // TC - O(n2)
        int n = arr.length;
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < n - 2; i++) {
            int left = i+1; // left index
            int right = n - 1; // right index
            while (left < right) {
                int currentSum = arr[left]+arr[right]+arr[i];
                if (currentSum==sum) {
                    List<Integer> list1 = new ArrayList<>();
                    list1.add(0,arr[i]);
                    list1.add(1,arr[left]);
                    list1.add(2,arr[right]);
                    list.add(list1);//add triplet to the list
                    break;
                } else if (currentSum>sum) {
                    right--;
                } else if (currentSum<sum) {
                    left++;
                }
            }
        }
        return list;
    }
}


//class Solution {
//    public List<List<Integer>> threeSum(int[] nums) {
//
//
//        Arrays.sort(nums);
//
//        List<List<Integer>> result = new ArrayList();
//
//        int index=0;
//        int left=1;
//        int right=nums.length-1;
//        int target=0;
//        int currentSum = 0;
//
//        while(left<right){
//            currentSum = nums[index] + nums[left] + nums[right];
//
//            if(currentSum == target){
//                List<Integer> list = new ArrayList();
//                list.add(nums[index]);
//                list.add(nums[left]);
//                list.add(nums[right]);
//                if(!result.contains(list)){
//                    result.add(list);
//
//                }
//                left++;
//                index++;
//                right--;
//            }
//
//            if(currentSum < target){
//
//                index++;
//            }
//            if(currentSum > target){
//                right--;
//            }
//        }
//        return result;
//    }
//}