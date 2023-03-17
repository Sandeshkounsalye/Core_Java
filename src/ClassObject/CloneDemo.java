package ClassObject;

public class CloneDemo implements Cloneable {
    String name;
    String surname;
    public static void main(String[] args) {

        CloneDemo cd=new CloneDemo();
        cd.name="Sandesh";
        cd.surname="Kounsalye";

        System.out.println("before clone : "+cd.name);
        System.out.println("before clone : "+cd.surname);

        try {
            CloneDemo cd1=(CloneDemo) cd.clone();

            System.out.println("After Clone : "+cd1.name);
            System.out.println("After Clone : "+cd1.surname);
        } catch (Exception e) {
           // System.out.println("Can't clone");
            System.out.println(e);
        }
    }
}
