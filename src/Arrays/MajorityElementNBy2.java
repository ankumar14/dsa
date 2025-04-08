package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//find element which appears more than n/2

public class MajorityElementNBy2 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 6, 6, 7, 2, 4, 2, 2, 2, 2, 5};

        //int result = findMajorityElement_M1(arr);
        int result = findMajorityElement_M2(arr);
        if (result == -1) {
            System.out.println("no such element found");
        } else {
            System.out.println("majority element = " + result);
        }
    }

    //Apply Moore's Voting Algo
    //Check whether the element found appears more than n/2
    private static int findMajorityElement_M2(int[] arr) { // TC - O(n) , SC - 1
        int count = 0;
        int element = -1;

        //find the element which ends up count > 0 at the end of this loop
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                element = arr[i];
                count++;
            } else if (arr[i] == element) {
                count++;
            } else {
                count--;
            }
        }

        //find the exact count of the element found in the array
        int check = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                check++;
            }
        }

        //check if the count > n/2
        if (check > arr.length / 2) {
            return element;
        } else {
            return -1;
        }
    }

    private static int findMajorityElement_M1(int[] arr) { //TC : NLogN + N ,SC - N
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {//NLogN
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> element : map.entrySet()) {//N
            if (element.getValue() > (arr.length / 2)) {
                return element.getKey();
            }
        }
        return -1;
    }


}
