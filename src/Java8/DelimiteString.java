package Java8;
import  java.util.*;
import java.util.stream.Collectors;

public class DelimiteString {

    public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");

        System.out.println(listOfStrings.stream().collect(Collectors.joining(",","[","]")));

    }
}
