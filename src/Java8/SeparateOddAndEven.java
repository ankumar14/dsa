package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SeparateOddAndEven {

    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,5,6);

        List<Integer> evenList = list.stream().filter(s->(s%2)==0).collect(Collectors.toList());
        System.out.println(evenList);
        List<Integer> oddList = list.stream().filter(s->s%2!=0).toList();
        System.out.println(oddList);

    }
}
