package Arrays;

//myArray = {1,2,3,4,6}
//findMissingNumberInArray(myArray, 6) // 5
public class MissingNumber {
    public static int findMissingNumberM1(int[] input) {//TC - O(n) , SC - O(1)
        int n = input.length + 1;
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;
        for (int number : input) {
            actualSum += number;
        }
        int missingNumber = expectedSum - actualSum;
        return missingNumber;
    }

    public static int findMissingNumberM2(int n, int[] arr) {
        int xor1 = 0, xor2 = 0;

        // XOR all array elements
        for (int i = 0; i < n - 1; i++) {
            xor2 ^= arr[i];
        }

        // XOR all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            xor1 ^= i;
        }

        // Missing number is the XOR of xor1 and xor2
        return xor1 ^ xor2;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        int n = arr.length;
        System.out.println(findMissingNumberM1(arr));
        System.out.println(findMissingNumberM2(n, arr));

    }
}
