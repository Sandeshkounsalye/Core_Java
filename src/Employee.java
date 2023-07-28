public final class Employee {
     //The instance variable of the class is final
    private String panNumber;


    public Employee(String panNumber){
        this.panNumber=panNumber;
    }

    //There is no setter methods
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
