package Sorting;

//Pushes the max to the last by adjacent swaps
//Time Complexity - n2 but in best case it can be n when array is already sorted

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {29,7,44,11,99,6};
        bubbleSort(array);
    }

    private static void bubbleSort(int[] array) {
        for (int i=0;i<array.length;i++){
            for (int j=i;j<array.length;j++){
                if(array[i]>array[j]){
                   int temp = array[i];
                   array[i] = array[j];
                   array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
