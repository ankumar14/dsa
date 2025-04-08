package Demo;

import java.util.ArrayList;
import java.util.List;
import  java.util.Arrays;

public class ITCInfotech {

    //List<Employee> employees = Arrays.asList(     new Employee("Alice", "HR"),     new Employee("Bob", "IT"),     new Employee("Charlie", "HR") );

    //o/p-> {"HR" : ["Alice", "Charlie"], "IT" : ["Bob"]}

    //write a program to merge two sorted arrays


    public static  void main(String[] args) {



        int[] arr1 = {1,3,5};

        int[] arr2 = {2,4,6};

        int left=0;
        int right= 0;
        int index=0;

        List<Integer> list = new ArrayList<>();

        while (left< arr1.length || right< arr2.length){
            if(arr1[left]>arr2[right]){
                list.add(index,arr2[right]);
                right++;
                index++;
            }
            else if (arr1[left]==arr2[right])
            {
                list.add(index,arr1[left]);
                left++;
                right++;
                index++;

            } else {
                list.add(index,arr1[left]);
                left++;
                index++;
            }
        }

        System.out.println(list);


    }

}

//class Employee{
//    String name;
//    String department;
//
//    public Employee(String name, String department) {
//        this.name = name;
//        this.department = department;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getDepartment() {
//        return department;
//    }
//}