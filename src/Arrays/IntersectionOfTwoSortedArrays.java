package Arrays;

import java.util.ArrayList;
import java.util.List;

//Find elements present in both the sorted arrays ( repetition allowed )
// Best approach - two pointer
public class IntersectionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 3, 4, 5, 6, 6};
        int[] arr2 = {2, 2, 3, 4, 4, 5, 6};
        intersectionOfTwoSortedArrays(arr1, arr2);
    }

    private static void intersectionOfTwoSortedArrays(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int index = 0;
        List<Integer> intersection = new ArrayList<>();
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] == arr2[j]) {
                intersection.add(index, arr1[i]);
                index++;
                i++;
                j++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            }
        }
        System.out.println(intersection);
    }

}
