package Java8;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicatesFromArray {
    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);

        Map<Integer,Long> map = listOfIntegers.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(map);

        List<Integer> duplicates = new ArrayList<>();

        for (Map.Entry<Integer,Long> e : map.entrySet()){
            if(e.getValue()>1){
                duplicates.add(e.getKey());
            }
        }

        System.out.println(duplicates);



    }
}
