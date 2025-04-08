package Hashing;

import java.util.HashMap;
import java.util.Map;

//Collision - Whenever all the values end up at the same hash key while hashing
//TimeComplexity - Log(N)

public class NumberHashingUsingMap {
    public static void main(String[] args) {
        int[] array = {1, 5, 4, 4, 2};//given array
        int[] required = {0, 4};//find count of
        findCount(array, required);
    }

    private static void findCount(int[] array, int[] required) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (hashMap.containsKey(array[i])) {
                hashMap.put(array[i], hashMap.get(array[i]) + 1);
            } else {
                hashMap.put(array[i], 1);
            }
        }
        System.out.println(hashMap);
        int[] count = {0};
        for (int i = 0; i < required.length; i++) {
            System.out.print(required[i] + "-" + hashMap.get(required[i]) + " ");
        }
    }
}
