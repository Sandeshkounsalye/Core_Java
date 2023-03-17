package Collection.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class StudentCustom {

    public static void main(String[] args) {
        Set<Student> studentSet=new LinkedHashSet<>();
        studentSet.add(new Student(5,"Ram",89));
        studentSet.add(new Student(3,"sandesh",73));
        studentSet.add(new Student(2,"mahesh",94));
        studentSet.add(new Student(1,"yash",81));
        studentSet.add(new Student(8,"shyam",59));
        studentSet.add(new Student(6,"raju",65));
        studentSet.forEach(System.out::println);


    }

}
