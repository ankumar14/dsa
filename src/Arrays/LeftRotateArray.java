package Arrays;

import java.util.Arrays;

public class LeftRotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        //leftRotateArrayOnePlace(arr);
        int places = 2;
        leftRotateArray(arr, 2);
    }

    private static void leftRotateArrayOnePlace(int[] arr) { // Time Complexity = O(n) , Space O(n)
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        System.out.println(Arrays.toString(arr));
    }

    private static void leftRotateArray(int[] arr, int i) {//left rotate the array by i elements
        //Time Complexity - O(n+i) , Space Complexity - O(i)
        System.out.println(Arrays.toString(arr));
        i = i % arr.length;
        int[] temp = new int[i];

        //store the first i elements of arr in the temp array
        for (int j = 0; j < i; j++) {
            temp[j] = arr[j];
        }

        //update the arr from 0th index till length-i elements
        for (int j = 0; j < arr.length - i; j++) {
            arr[j] = arr[j + i];
        }
        int k = 0;

        //update the last i elements in arr with the elements from the temp array
        for (int j = arr.length - i; j < arr.length; j++) {
            arr[j] = temp[k];
            k++;
        }
        System.out.println(Arrays.toString(arr));
    }

}
