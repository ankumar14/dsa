package Java8;

import java.util.*;
public class SortStringsLengthWise {
    public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");

        List<String> sortedList = listOfStrings.stream().sorted(Comparator.naturalOrder()).toList();

        System.out.println(sortedList);
    }
}
