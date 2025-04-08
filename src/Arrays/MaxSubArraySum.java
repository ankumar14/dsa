package Arrays;

//Kadane's Algo
public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3}; // output expected = 7
        maxSubArraySum(arr);
    }

    private static void maxSubArraySum(int[] arr) {
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(sum<0){
                sum=0;
            }
            sum += arr[i];
            maxi = Integer.max(maxi,sum);
        }
        System.out.println(maxi);
    }
}
