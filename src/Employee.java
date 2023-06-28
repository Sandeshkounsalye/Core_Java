public final class Employee {

    private String panNumber;
    public Employee(String panNumber){
        this.panNumber=panNumber;
    }
    public String getPancardNumber(){
            return panNumber;
    }
}
class Test{
    public static void main(String[] args) {
       Employee e1=new Employee("GKOWS2121P") ;
        System. out.println(e1.getPancardNumber());
    }
}
