package Collection.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class EmployeeRecord {
    public static void main(String[] args) {
        Employee employee1=new Employee(78,"Ram",24500);
        Employee employee3=new Employee(12,"Om",45000);
        Employee employee5=new Employee(1,"Amit",30000);
        Employee employee4=new Employee(46,"John",9000);
        Employee employee2=new Employee(6,"Shyam",66500);
        Employee employee6=new Employee(6,"Shyam",66500);

        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);


        employeeList.forEach(System.out::println);
        System.out.println("After Sorting");

        Collections.sort(employeeList);
        employeeList.forEach(System.out::println);

    }
}
