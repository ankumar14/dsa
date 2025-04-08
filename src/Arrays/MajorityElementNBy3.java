package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Return all the elements appearing more than n/3 times
//Maximum 2 elements can be which appear more than n/3 times and minimum 0
public class MajorityElementNBy3 {

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 3, 2, 2, 2,4,4,4,5,1,1};
        //System.out.println(majorityElementNBy3_M1(arr));
        System.out.println(majorityElementNBy3_M2(arr));
    }

    //Using Moore's Algo
    private static List<Integer> majorityElementNBy3_M2(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int count1 = 0, count2 = 0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (count1 == 0 && el2 != arr[i]) {
                count1 = 1;
                el1 = arr[i];
            } else if (count2 == 0 && el1 != arr[i]) {
                count2 = 1;
                el2 = arr[i];
            } else if (arr[i] == el1) {
                count1++;
            } else if (arr[i] == el2) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        int check1 = 0 , check2 = 0;
        //find the exact count of element1 and element2 in the array
        for (int i=0;i< arr.length;i++){
            if(arr[i]==el1){
                check1++;
            }
            else if(arr[i]==el2){
                check2++;
            }
        }
        if (check1> arr.length/3){
            list.add(el1);
        }
        if(check2> arr.length/3){
            list.add(el2);
        }
            return list;
    }

    //Using HashMap : TC - O(NlogN)
    private static List<Integer> majorityElementNBy3_M1(int[] arr) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], 1 + map.getOrDefault(arr[i], 0));
            if (map.get(arr[i]) > arr.length / 3 && !list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }
        System.out.println(map);
        return list;
    }
}
