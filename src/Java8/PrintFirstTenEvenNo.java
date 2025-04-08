package Java8;
import java.util.*;
import java.util.stream.IntStream;

public class PrintFirstTenEvenNo {

    public static void main(String[] args) {

        IntStream.rangeClosed(1,10).map(i->i*2).forEach(System.out::println);
    }
}
