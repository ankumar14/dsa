package Java8;

import java.util.*;
public class FindLastElementOfAnArray {
    public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");

        System.out.println(listOfStrings.stream().skip(listOfStrings.size()-1).findFirst().get());
    }
}
