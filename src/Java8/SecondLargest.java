package Java8;

import java.util.*;
import java.util.stream.Collectors;

public class SecondLargest {

    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        int secondLargest = listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

        System.out.println(secondLargest);

    }
}
