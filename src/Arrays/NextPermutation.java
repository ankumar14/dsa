package Arrays;

//Given input = {3,1,2}
//Total permutations in dictionary order
//1,2,3
//1,3,2
//2,1,3
//2,3,1
//3,1,2 - our input
//3,2,1 - expected output
//output - {3,2,1}


import java.util.*;

//Step 1 : find the longest prefix match i. e a[i] < a[i+1]
//Step 2 : find the element greater than the breakpoint but the smallest one among them
//Step 3 : Try to place the remaining in sorted order

public class NextPermutation {

    public static List<Integer> nextGreaterPermutation(List<Integer> list) {
        int n = list.size(); // size of the array.

        // Step 1: Find the break point:
        int ind = -1; // break point
        for (int i = n - 2; i >= 0; i--) {
            if (list.get(i) < list.get(i+1)) {
                // index i is the break point
                ind = i;
                System.out.println("breakpoint = " + i);
                break;
            }
        }

        // If break point does not exist:
        if (ind == -1) {
            // reverse the whole array:
            Collections.reverse(list);
            return list;
        }

        // Step 2: Find the next greater element
        //         and swap it with arr[ind]:

        for (int i = n - 1; i > ind; i--) {
            if (list.get(i) > list.get(ind)) {
                int temp = list.get(i);
                list.set(i, list.get(ind));
                list.set(ind,temp);
                break;
            }
        }

        // Step 3: sort the remaining element:
        List<Integer> sublist = list.subList(ind + 1, n);
        Collections.reverse(sublist);
        return list;
    }

    public static void main(String args[]) {
        //int[] arr = {2, 1, 5, 4, 3, 0, 0};


        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the length of the list : ");
        int n = scanner.nextInt();
        for (int i = 0 ; i< n ; i++){
            list.add(i,scanner.nextInt());
        }
        System.out.println("given list : " + list);
        List<Integer> ans = nextGreaterPermutation(list);
        System.out.println("next permutation : " + ans);

    }

}
