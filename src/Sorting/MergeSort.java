package Sorting;

import java.util.Arrays;
//Time Complexity : n log n
//Divide and merge
//Divide entire array into two halves a1 and a2
//Divide a1 and a2 up to single elements each
//merge a1 and a2 comparing back the elements separately
//finally merge a1 and a2 by comparing and moving the two pointers
//        low = leftmost index of the array
//        high = rightmost index of the array
//        mid = Middle index of the array
public class MergeSort {
    public static void main(String[] args) {
        int[] a = {5,17,1,99,2};
        int n = 5;
        mergeSort(a, 5);
        System.out.println(Arrays.toString(a));
    }

    public static void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);
        merge(a, l, r, mid, n - mid);
    }

    public static void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}
