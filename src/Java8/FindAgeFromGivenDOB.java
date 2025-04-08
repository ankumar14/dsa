package Java8;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
public class FindAgeFromGivenDOB {
    public static void main(String[] args) {

        LocalDate birthDay = LocalDate.of(1985, 01, 23);
        LocalDate today = LocalDate.now();

        System.out.println(ChronoUnit.YEARS.between(birthDay,today));
    }
}
