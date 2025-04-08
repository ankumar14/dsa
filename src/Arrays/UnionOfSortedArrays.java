package Arrays;

//find the union of two sorted arrays
//Brute Force - we can use set also for the same
//Optimal Solution - use two pointer , TC - O(n1+n2) , SC - O(n1+n2)


import java.util.ArrayList;
import java.util.List;

public class UnionOfSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4, 5, 5, 6 };
        int[] arr2 = {2, 2, 6, 6, 7,8};
        unionOfSortedArrays(arr1, arr2);
    }

    private static void unionOfSortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i1 = 0;
        int i2 = 0;
        int index = 0;
        List<Integer> union = new ArrayList<>();

        while (i1 < n1 && i2 < n2) {
            if (arr1[i1] < arr2[i2]) {
                if (!union.contains(arr1[i1])) {
                    union.add(index, arr1[i1]);
                    index++;
                }
                i1++;
            } else {
                if (!union.contains(arr2[i2])) {
                    union.add(index, arr2[i2]);
                    index++;
                }
                i2++;
            }
        }

        //iterating once again for the left elements of arr2
        while (i2 < n2) {
            if (!union.contains(arr2[i2])) {
                union.add(index, arr2[i2]);
                index++;
            }
            i2++;
        }
        System.out.println(union);
    }
}
