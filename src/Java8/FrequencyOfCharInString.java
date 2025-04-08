package Java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfCharInString {

    public static void main(String[] args) {

        String str = "abbcccddddeeeee";

        Map<Character, Long> charCount =        str
                                                    .chars()
                                                    .mapToObj(c->(char)c)
                                                    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + "-" + entry.getValue()));

    }
}
