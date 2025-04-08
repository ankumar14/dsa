package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 4, 4, 5, 5, 5, 5,6};
        int n = arr.length;
       //removeDuplicatesM1(arr);
       //removeDuplicatesM2(arr, n);
        removeDuplicatesM3(arr,n);
    }

    public static int[] removeDuplicatesM1(int[] input) {//Time Complexity: O(n)  Space Complexity : O(n)
        boolean isDuplicate = false;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < input.length; i++) {
            set.add(input[i]);
        }
        System.out.println(set);
        //System.out.println(Arrays.toString(input));
        for (int i = 0; i < set.size(); i++) {
            input[i] = set.hashCode();
        }

        return input;
    }

    public static int[] removeDuplicatesM2(int[] arr, int n) {//Time Complexity: O(n)  Space Complexity : O(1)
        if (n == 0 || n == 1)
            return arr;

        // To store index of next unique element
        int j = 0;

        for (int i = 0; i < n-1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j] = arr[i];
                j++;
            }
        }
        arr[j++] = arr[n - 1];

        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ");
        }


        return arr;
    }

    public static int[] removeDuplicatesM3(int[] arr, int n){

        int index = 0;

        for(int i =0;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                index++;
                arr[index]=arr[i+1];
            }

        }

        for (int i=0;i<index+1;i++){
            System.out.print(arr[i] + " ");
        }

        return arr;
    }

}
