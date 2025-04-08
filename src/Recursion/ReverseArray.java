package Recursion;

import java.util.Arrays;

public class ReverseArray {
    public static void reverseArray(int forward , int backward, int[] arr){
        if(forward>backward){
            System.out.println(Arrays.toString(arr));
            return;
        }
        arr[forward]=arr[backward]+arr[forward];
        arr[backward]=arr[forward]-arr[backward];
        arr[forward]=arr[forward]-arr[backward];
        reverseArray(forward+1,backward-1,arr);
    }

    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6,7,8,9,10};
        reverseArray(0,input.length-1,input);
    }
}
