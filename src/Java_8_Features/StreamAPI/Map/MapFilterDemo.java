package Java_8_Features.StreamAPI.Map;

import java.util.ArrayList;
import java.util.Comparator;
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
    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", empname='" + empname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class MapFilterDemo {
    public static void main(String[] args) {
     //Collection --> stream ---> Filter ---> map ---> collect

        List<Employee> employeeList=new ArrayList<Employee>();
        employeeList.add(new Employee(11,"Alex",10000));
        employeeList.add(new Employee(19,"David",20000));
        employeeList.add(new Employee(13,"John",30000));
        employeeList.add(new Employee(54,"Sam",40000));
        employeeList.add(new Employee(5,"Edward",50000));

        List<Integer> salaryList=employeeList.stream().filter(e->e.salary>20000).map(e->e.salary).collect(Collectors.toList());
        System.out.println(salaryList);

        //Sorting the on id based
        Comparator<Employee> productComparator=(p1,p2)->p1.empid-p2.empid;
         //  employeeList.stream().sorted(productComparator).collect(Collectors.toList()).forEach(e->System.out.println(e.empid + " "+e.empname+ " "+e.salary));
       employeeList.stream().sorted(productComparator).collect(Collectors.toList()).forEach(System.out::println);
    }
}
