package Collection.List;

public class Employee implements Comparable<Employee> {
     private int id;
    private String Name;
    private int salary;
    public Employee(int id, String name, int salary) {
        this.id = id;
        Name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", salary=" + salary +
                '}';
    }


    @Override
    public int compareTo(Employee employee) {
        return this.getId()-employee.getId();
//        return employee.getId().compareTo(this.getId());
    }

}
