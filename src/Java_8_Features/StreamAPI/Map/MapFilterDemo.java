package Java_8_Features.StreamAPI.Map;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    int empid;
    String empname;
    int salary;

    public Employee(int empid, String empname, int salary) {
        this.empid = empid;
        this.empname = empname;
        this.salary = salary;
    }
}

public class MapFilterDemo {
    public static void main(String[] args) {
     //Collection --> stream ---> Filter ---> map ---> collect
        List<Employee> employeeList=new ArrayList<Employee>();
        employeeList.add(new Employee(101,"Alex",10000));
        employeeList.add(new Employee(102,"David",20000));
        employeeList.add(new Employee(103,"John",30000));
        employeeList.add(new Employee(104,"Sam",40000));
        employeeList.add(new Employee(105,"Edward",50000));

        List<Integer> salaryList=employeeList.stream().filter(e->e.salary>20000).map(e->e.salary).collect(Collectors.toList());
        System.out.println(salaryList);

    }


}
