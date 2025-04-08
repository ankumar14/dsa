package Java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumOfAllDigits {

    public static void main(String[] args) {

        int num =  1234;

        Integer sum = Stream.of(String.valueOf(num).split("")).collect(Collectors.summingInt(Integer::parseInt));

        Integer sum1 = Arrays.stream(String.valueOf(num).split("")).collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(sum);

        System.out.println(sum1);

    }
}
