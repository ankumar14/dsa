package Arrays;

import java.util.Arrays;

//input - {1,5,0,88,66,0,9,0} output - {1,5,88,66,9,0,0,0}
public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 5, 0, 88, 66, 0, 0, 0, 9, 0};
        moveZeroesToEnd(arr);
    }

    private static void moveZeroesToEnd(int[] arr) {
        int j = -1;
        //find the index of first zero
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        //swap if element is non zero with j index element
        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                arr[i] = 0;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
