package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Create1DArray {
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
}
