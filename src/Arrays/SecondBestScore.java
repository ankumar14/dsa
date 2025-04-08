package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SecondBestScore {
    public static int[] createArray(int length) {
        int[] array = new int[length];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < length; i++) {
            System.out.print("enter element at position " + i + " : ");
            array[i] = scanner.nextInt();
            System.out.println("");
        }
        System.out.println("your entered array = " + Arrays.toString(array));
        return array;
    }

    public static int[] getSecondBestScore(int[] input) {
        int firstBestScore = Integer.MIN_VALUE;
        int secondBestScore = Integer.MIN_VALUE;
        int[] firstAndSecondBestScore = new int[2];
        for (int i = 0; i < input.length; i++) {
            if (input[i] > firstBestScore) {
                secondBestScore = firstBestScore;
                firstBestScore = input[i];
            }
        }

        firstAndSecondBestScore[0] = firstBestScore;
        firstAndSecondBestScore[1] = secondBestScore;
        System.out.println("first and second best score is " + Arrays.toString(firstAndSecondBestScore));
        return firstAndSecondBestScore;
    }

    public static void main(String[] args) {
        getSecondBestScore(createArray(7));
    }
}
