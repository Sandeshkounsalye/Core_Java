package Oop.ObjectClass;

public class HashCodeMethod {
    public static void main(String[] args) {
        Student student=new Student(12,"Ram");
        Student student1=new Student(22,"Shyam");

        //student=student1;

        System.out.println(student.hashCode());
        System.out.println(student1.hashCode());


        System.out.println(student.toString());
        System.out.println(student1.toString());




    }


}
