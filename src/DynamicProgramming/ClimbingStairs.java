package DynamicProgramming;

public class ClimbingStairs {

    public static int climbStairs(int n) {

        int[] waysToClimbNthStair = new int[n];

        if (n == 1 || n == 0) {
            return 1;
        }
        waysToClimbNthStair[0] = 1; //no of ways to climb one stair
        waysToClimbNthStair[1] = 2; //no. of ways to climb 2 stairs


        for (int i = 2; i < n; i++) {
            waysToClimbNthStair[i] = waysToClimbNthStair[i - 1] + waysToClimbNthStair[i - 2];
        }

        return waysToClimbNthStair[n - 1];


    }

    public static void main(String[] args) {
        System.out.println(climbStairs(2));

    }
}
