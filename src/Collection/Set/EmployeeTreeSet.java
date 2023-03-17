package Collection.Set;

import java.util.Set;
import java.util.TreeSet;

public class EmployeeTreeSet {
    public static void main(String[] args) {
//        Set <Employee> employeeSet=new TreeSet<>((o1,o2)-> o1.getEmpId()-o2.getEmpId());
        Set <Employee> employeeSet=new TreeSet<>((o1,o2)-> o1.getEmpSalary()-o2.getEmpSalary());
        employeeSet.add(new Employee(104,"Sam",45000));
        employeeSet.add(new Employee(106,"Ram",55000));
        employeeSet.add(new Employee(101,"Ron",45000));
        employeeSet.add(new Employee(103,"John",85000));
        employeeSet.add(new Employee(105,"Jem",75000));
        employeeSet.add(new Employee(102,"Ani",35000));
        employeeSet.forEach(System.out::println);
    }
}
