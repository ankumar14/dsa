package Arrays;

import java.util.*;

//Given array is the price of stock on nth day , find the day to buy and sell stock for max profit
public class BestTimeToBuyAndSellStocks {



    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(arr));
    }


    static List<Integer> maxProfit(int[] prices) {
        int minSoFar = prices[0];
        int res = 0;

        // Update the minimum value seen so far
        // if we see smaller
        for (int i = 0; i < prices.length; i++) {
            minSoFar = Math.min(minSoFar, prices[i]);
            // Update result if we get more profit
            res = Math.max(res, prices[i] - minSoFar);
        }


        List<Integer> list = new ArrayList<>();
        list.add(minSoFar);
        list.add(minSoFar+res);
        list.add(res);
        return list;
    }
}
