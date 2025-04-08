package Java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseIntegerArray {

    public static void main(String[] args) {
        int[] array = {5, 1, 7, 3, 9, 6};

        int[] reverse =IntStream.rangeClosed(1, array.length).map(i->array[array.length-i]).toArray();

        System.out.println(Arrays.toString(reverse));
    }



}
