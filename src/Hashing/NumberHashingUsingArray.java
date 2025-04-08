package Hashing;

//Hashing means pre-storing/fetching
//whatever maximum value an array has - the hash array will have length array.length + 1

import java.util.Arrays;

public class NumberHashingUsingArray
{
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 2};//given array
        int[] required = {1, 4, 2, 3, 12};//we need to find how many times these elements appear in given array.
        //required output : tell me how many times 1,4,2,3,12 appears in the given array
        findIntCount(array, required);
    }

    private static void findIntCount(int[] array, int[] required) {
        int[] hash = new int[13];
        for (int i = 0; i < array.length; i++) {
            hash[array[i]] += 1;
        }
        System.out.println(Arrays.toString(hash));


        int[] count = new int[required.length];

        for (int i = 0; i < required.length; i++) {
            count[i] = hash[required[i]];
        }
        System.out.println(Arrays.toString(count));
    }
}
