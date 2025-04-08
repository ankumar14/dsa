package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintSubsequenceSumK {
    public static void main(String[] args) {
        int[] array = {1,2,1};
        int expectedSum = 2;
        int sum = 0;
        List<Integer> subsequence = new ArrayList<>();
        printSequenceSumK(0,array,sum,expectedSum,subsequence);
    }

    public static void printSequenceSumK(int i, int[] array, int sum ,int expectedSum,List<Integer> subsequence) {
        if(i==array.length){
            if(sum==expectedSum){
                System.out.println(subsequence);
            }
            return;
        }
        subsequence.add(array[i]);
        sum+=array[i];
        printSequenceSumK(i+1,array,sum,expectedSum,subsequence);
        subsequence.remove(subsequence.size()-1);
        sum-=array[i];
        printSequenceSumK(i+1,array,sum,expectedSum,subsequence);

    }
}
