package Java8;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintDuplicatesInAString {
    public static void main(String[] args) {

        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();


        Map<Character, Long> map =        inputString
                .chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        List<Character> listOfDuplicates = new ArrayList<>();

        for (Map.Entry<Character,Long> e : map.entrySet()){
            if(e.getValue()>1){
                listOfDuplicates.add(e.getKey());
            }
        }

        System.out.println(listOfDuplicates);
    }
}
