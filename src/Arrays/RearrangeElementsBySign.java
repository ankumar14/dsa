package Arrays;

import java.util.Arrays;

//Input -  array has +ve numbers and -ve numbers
//Output - array should be arranged as a combination of +ve,-ve,+ve,-ve.... till n while keeping the order of +ve and -ve intact which was in the given array
public class RearrangeElementsBySign {
    public static void main(String[] args) {
        int[] arr = {3, 1, -2, -5, 2, -4};
        System.out.println(Arrays.toString(posEqualsNeg(arr)));

        int[] arr2 = {3, 1, -2, -5, 2, -4,8,9};
        System.out.println(Arrays.toString(posNotEqualsNeg(arr2)));
    }

    private static int[] posNotEqualsNeg(int[] arr2) {
        return arr2;
        //break it into 2 arrays : one of +ve elements and other of -ve elements
        //add into output array one by one
        //left over elements add to output arrays in the end
    }

    private static int[] posEqualsNeg(int[] arr) {
        int posIndex = 0;
        int negIndex = 1;
        int[] output = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                output[negIndex] = arr[i];
                negIndex += 2;
            } else {
                output[posIndex] = arr[i];
                posIndex += 2;
            }
        }
        return output;
    }
}
