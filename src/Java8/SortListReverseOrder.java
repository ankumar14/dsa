package Java8;
import java.util.*;
import java.util.stream.Collectors;

public class SortListReverseOrder {

    public static void main(String[] args) {

        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85);

        List<Double> sortedList = decimalList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(sortedList);

    }
}
