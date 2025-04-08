package Java8;

import java.util.*;
public class MinAndMaxOfList {

    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        int min = listOfIntegers.stream().sorted().min(Comparator.naturalOrder()).get();

        int max = listOfIntegers.stream().sorted().max(Comparator.naturalOrder()).get();

        System.out.println(min + "," + max);
    }
}
