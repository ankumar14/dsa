package Demo;
import  java.util.*;
import java.util.stream.Collectors;

public class NewDemo1 {
    public static void main(String[] args) {


        int[] arr = {1, 2, 1, 3, 4, 5, 3, 6, 6, 8}; //--> output - 2
        //Find First number with least occurrence

        //to store the element and its count
        Map<Integer, Integer> map = new LinkedHashMap<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                count = map.get(arr[i]);
            }
            map.put(arr[i],count + 1);

        }
        //element,count
        System.out.println(map);
        int min =1;
        int output = 0;
        for (Map.Entry<Integer,Integer> e : map.entrySet()){
          if(e.getValue()<=min){
              min = e.getValue();
              output = e.getKey();
          }
        }
        System.out.println(output);

    }
}


////public interface Login{
////
////     default List<String> getLoginCredentials(String username , String password){
////
////    }
////}
//
////Create a functional interface --> login method with two parameters (useraname , password )
//
//class Employee
//{
//    int id;
//    String name;
//    int age;
//    String gender;
//    String department;
//    int yearOfJoining;
//    double salary;
//  //  List<Company> pastExList;
//
//}
////
////class Company{
////    empId, exp, yoj
////}
////
////
////list of companies --> listOfCompany
////
//////sort company desc
////                listOfCompany.stream().sorted(c1,c2 -> c2.getExp - c1.getExp).toList(); //sort by desc order of company experience
////
//////get data on the basis of department --> give the count on the basis of the department
////
////list of employess - > employeeList
////
////                employeeList.stream().collect(Collectors.groupingBy(Employee::department),Collectors.counting()).toList();
////
////HR --> 2
////Tech -- > 5
////
//////