package Java8;

import java.util.*;
import java.util.stream.Collectors;


public class GroupByField {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(     new Employee("Alice", "HR"),     new Employee("Bob", "IT"),     new Employee("Charlie", "HR") );

        Map<String,List<Employee>> map = new HashMap<>();
       employees.stream().collect(Collectors.groupingBy(Employee::getDept)).entrySet().stream().forEach(System.out::println);
      //  System.out.println(map);

//        for (Map.Entry<String, List<Employee>> e : map.entrySet()){
//            System.out.println(e.getKey() + " : " + e.getValue().toString());
//        }
    }
}

class Employee{

    private String name;
    private String dept;

    public Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    @Override
    public String toString() {
        return name;
    }
}
