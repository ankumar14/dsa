package Java8;
import java.util.*;
import java.util.stream.IntStream;

public class SumOfFirstTenNaturalNumbers {

    public static void main(String[] args) {

        int sum = IntStream.range(1,11).sum();

        System.out.println(sum);

        int[] arr= {1,2,3,4,5};

        System.out.println(Arrays.stream(arr).sum());

    }
}
