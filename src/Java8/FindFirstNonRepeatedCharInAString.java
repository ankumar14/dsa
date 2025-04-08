package Java8;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatedCharInAString {

    public static void main(String[] args) {

        String inputString = "i know That this is the best day".replaceAll("\\s+","").toLowerCase();

        Map<String,Long> map = Arrays.stream(inputString.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));

        System.out.println(map);

        String s  = map.entrySet().stream().filter(i->i.getValue()==1).map(e->e.getKey()).findFirst().get();

        System.out.println(s);
    }
}
