package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateFromList {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,2,3,4,4,5,6,6);

        List<Integer> newList = list.stream().distinct().collect(Collectors.toList());

        System.out.println(newList);
    }
}
