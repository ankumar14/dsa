package Demo;

import java.util.*;

public class NewDemo {
    public static void main(String[] args) {

        int[] arr = { 1, 4, 45, 6, 10, 8 };

        Arrays.sort(arr);

        int index = 0;
        int target = 22;

       // List<Integer> list = new ArrayList<>()
       for (int i=0;i<arr.length;i++){

           int currentSum = 0;
           int left = 1;
           int right = arr.length-1;
           while (left<right){

               currentSum = arr[index] + arr[left] + arr[right];

               if(currentSum==target){
                   List<Integer> list1 = new ArrayList<>(3);
                   list1.add(arr[index]);
                   list1.add(arr[left]);
                   list1.add(arr[right]);
                   System.out.println(list1);
                   break;
               }
               else if(currentSum<target){
                   left++;
               }
               else {
                   right--;
               }
           }
           index++;
       }




    }
}


//Input:
//        { 1, 4, 45, 6, 10, 8 }; -- {1,4,6,8,10,45}
//sum = 22;
//Output:
//        4, 10, 8


//first sort the array
//