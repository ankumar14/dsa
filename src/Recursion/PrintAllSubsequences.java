package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsequences {

    public static void main(String[] args) {
        int[] input = {1,2,3};
        int n = input.length;
        List<Integer> list = new ArrayList<>();
        printAllSubsequences(0,input,list,n);
    }

    public static void printAllSubsequences(int index, int[] input, List<Integer> list, int n) {
        if(index==n){
            System.out.println(list);
            return;
        }
        list.add(input[index]);
        printAllSubsequences(index+1,input,list,n);
        list.remove(list.size()-1);
        printAllSubsequences(index+1,input,list,n);
    }
}

