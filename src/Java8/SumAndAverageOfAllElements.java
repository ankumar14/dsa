package Java8;
import java.util.*;
import java.util.stream.IntStream;

public class SumAndAverageOfAllElements {

    public static void main(String[] args) {
        int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};

        int sum = IntStream.of(a).sum();

        System.out.println(sum);

        OptionalDouble avg = IntStream.of(a).average();

        System.out.println(avg);


    }
}
