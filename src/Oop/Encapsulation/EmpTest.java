package Oop.Encapsulation;

public class EmpTest {
    public static void main(String[] args) {
        Employee emp = new Employee(101,"John",56);
        System.out.println(emp.getId());
        System.out.println(emp.getName());
        System.out.println(emp.getAge());
    }
}
