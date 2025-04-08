package Java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseEachWordOfAString {

    public static void main(String[] args) {

        String str = "Java Concept Of The Day";

        String reverse = Arrays.stream(str.split(" "))
                .map(word -> new StringBuffer(word).reverse())
                .collect(Collectors.joining(" "));


        System.out.println(reverse);


    }
}
