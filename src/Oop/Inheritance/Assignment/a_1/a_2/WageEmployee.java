package Oop.Inheritance.Assignment.a_1.a_2;

public class WageEmployee extends Employe{
    public WageEmployee(int hrs, int rate) {
        super(hrs, rate);
    }

    void computeSalary(){
        int salary=hrs*rate;
        System.out.println(salary);
    }
}
