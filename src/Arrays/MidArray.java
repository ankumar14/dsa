package Arrays;

import java.util.Arrays;
import java.util.Scanner;


public class MidArray {


    public static int[] getMidArray(int[] input) {
        int[] midArray = new int[input.length - 2];
        for (int i = 0; i < midArray.length; i++) {
            midArray[i] = input[i + 1];
        }
        System.out.println("Your midArray = " + Arrays.toString(midArray));
        return midArray;

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length of the array : ");
        int length = scanner.nextInt();
        getMidArray(Create1DArray.createArray(length));
    }

}

