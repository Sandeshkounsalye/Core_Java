package CRUD_operation;

public class Employee {
   private int empno;
   private String ename;
   private int salary;

    public Employee(int empno, String enamel, int salary) {
        this.empno = empno;
        this.ename = enamel;
        this.salary = salary;
    }

    public int getEmpno() {
        return empno;
    }

    public String getEname() {
        return ename;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", salary=" + salary +
                '}';
    }
}

