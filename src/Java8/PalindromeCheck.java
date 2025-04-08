package Java8;
import java.util.*;
import java.util.stream.Collectors;

public class PalindromeCheck {

    public static void main(String[] args) {
        String str = "ROTATORA";

        String reverse = Arrays.stream(str.split(" "))
                .map(word -> new StringBuffer(word).reverse())
                .collect(Collectors.joining(""));

        System.out.println(reverse);

        String reverse1 = Arrays.stream(str.split(" ")).map(word-> new StringBuffer(word).reverse()).collect(Collectors.joining(""));
        System.out.println(reverse1);

        if(str.equals(reverse)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("not palindrome");
        }

    }
}
