package Arrays;

import java.util.HashMap;
import java.util.Map;

//input - {1,1,2,3,3,4,4}
//output - 2
public class SingleElementAmongDoubles {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3,3, 4, 4};
        System.out.println(singleElementAmongDoubles(arr));
    }

    private static int singleElementAmongDoubles(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();

        // Store the frequency of each element
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        System.out.println(freq.entrySet());
        // Find and return the element that appears only once
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        // If no single element is found, return -1
        return -1;
    }

}
