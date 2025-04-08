package Demo;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class ADB {
    public static void main(String[] args) {

        String s= "abccbezefabc"; // expected output == z is the first non repeatable character






    }

    public static boolean isPallindrom(String s){
        boolean flag= true;
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                flag= false;
                break;
            }
        }
        return flag;
    }
}

//Having clause

//select * from emp where name Having values {1,2,3}
//
//select deptName , count(emp_id) from emp  groupBy(deptName);
//
//emp_id,emp_name,salary,manager_id(actually an emp id) // to find all the emp whose salary > his/her manager
//
//select * from emp groupBy(manager_id) and emp.salary > manager_id.salary

//

//code to find a palindrome

//code to find the first non-repeatable element in a string using java8 and normally too

//where and how we use qualifier in spring boot

//what is autoscaling

//authentication and authorisation module . how does it work

//design principles