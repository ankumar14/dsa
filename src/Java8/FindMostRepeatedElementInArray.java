package Java8;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindMostRepeatedElementInArray {
    public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");

        Map<String,Long> map = listOfStrings.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(map.entrySet().stream().max(Map.Entry.comparingByValue()).get());

//
//        Long max = 0L;
//        String mostRepeated = null;
//        for (Map.Entry<String,Long> e : map.entrySet()){
//            if(e.getValue()>max){
//                mostRepeated = e.getKey();
//                max = e.getValue();
//            }
//        }
//
//        System.out.println(mostRepeated + "," + max);

    }
}
