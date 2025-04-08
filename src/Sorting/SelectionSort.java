package Sorting;

//Step 1 : Select minimum and swap
//Step 2 : Select minimum and swap ( exclude arr[0] from this step ).....so on except the last element
//Time Complexity : n2

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {12,6,24, 122, 3, 91,88,55,9};
        selectionSort(array);
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
