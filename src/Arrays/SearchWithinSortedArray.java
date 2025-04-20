package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchWithinSortedArray {

    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1; //6
        int index = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (target == nums[mid]) {
                index = mid;
                break;
            }
            if (nums[mid] > nums[low]) {                //if left part of array is sorted , search target here
                if (target >= nums[low] && target < nums[mid]) {            //if target within this range
                    high = mid-1;              //update high
                }
                else {
                    low = mid+1;
                }
            } else {                                       // else right part of array is sorted , search target here
                if (target > nums[mid] && target < nums[high]) {            //if target within this range
                    low = mid+1;   //update low
                }
                else {
                    high =mid-1;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(nums, 3));
    }
}
