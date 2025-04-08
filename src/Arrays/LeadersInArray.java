package Arrays;

import java.util.ArrayList;
import java.util.List;

//Leader - every element to the right of it is smaller than it
public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};
        System.out.println(findLeaders(arr));
    }

    private static List<Integer> findLeaders(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int maxi = Integer.MIN_VALUE;
        int i = arr.length - 1;
        while (i >= 0) {
            maxi = Integer.max(maxi, arr[i]);
            if (!list.contains(maxi)) {
                list.add(maxi);
            }
            i--;
        }
        return list;
    }
}
