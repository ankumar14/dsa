package Java8;

import java.util.*;

public class PrintMultipleOf5 {

    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        listOfIntegers.stream().filter(s->s%5==0).forEach(System.out::println);
    }
}
