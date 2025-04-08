package Sorting;

import java.util.Arrays;

//Takes an element and places it in its correct order
public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {44, 77, 22, 11, 6, 29, 88, 6};
        insertionSort(array);
    }

    private static void insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int j = i;
            while ( j>0){
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
                j--;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

