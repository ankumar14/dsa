package Java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstRepeatedCharInAString {
    public static void main(String[] args) {

        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();

        String s = Arrays.stream(inputString.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(i->i.getValue()>1).findFirst().get().getKey();

        System.out.println(s);
    }
}
