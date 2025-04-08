package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FourSum {
    public static ArrayList<ArrayList<Integer>> fourSum_M1(int[] num, int target) {

        Arrays.sort(num);
        HashSet<ArrayList<Integer>> hSet = new HashSet<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                for (int k = j + 1, l = num.length - 1; k < l; ) {
                    int sum = num[i] + num[j] + num[k] + num[l];
                    if (sum > target) {
                        l--;
                    } else if (sum < target) {
                        k++;
                    } else if (sum == target) {
                        ArrayList<Integer> found = new ArrayList<Integer>();
                        found.add(num[i]);
                        found.add(num[j]);
                        found.add(num[k]);
                        found.add(num[l]);
                        if (!hSet.contains(found)) {
                            hSet.add(found);
                            result.add(found);
                        }
                        k++;
                        l--;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 2, 2};
        int target = 3;
        System.out.println(fourSum_M1(arr, target));
    }

}
