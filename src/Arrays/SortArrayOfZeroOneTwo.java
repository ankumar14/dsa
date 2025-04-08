package Arrays;

import java.util.Arrays;

//Dutch National Flag Algorithm - three pointers
public class SortArrayOfZeroOneTwo {
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,2,1,0,2,2,1,0,0};
        sortArrayOfZeroOneTwo(arr);
    }

    private static void sortArrayOfZeroOneTwo(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        while (mid<high){
            if(arr[mid]==0){
                //swap arr[mid] and arr[low]
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else {
                //swap arr[mid] and arr[high-1]
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high]=temp;
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
