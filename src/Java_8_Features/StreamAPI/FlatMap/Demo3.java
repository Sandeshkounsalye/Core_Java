package Java_8_Features.StreamAPI.FlatMap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    String sName;
    int sMark;
    char grade;

    public Student(String sName, int sMark, char grade) {
        this.sName = sName;
        this.sMark = sMark;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sName='" + sName + '\'' +
                ", sMark=" + sMark +
                ", grade=" + grade +
                '}'+"\n";
    }
}
public class Demo3 {
    public static void main(String[] args) {
        List<Student>  list1=new ArrayList<>();
        list1.add(new Student("Suraj",62,'D'));
        list1.add(new Student("Advait",86,'B'));
        list1.add(new Student("Vijay",55,'E'));

        List<Student>  list2=new ArrayList<>();
        list2.add(new Student("Rahul",77,'C'));
        list2.add(new Student("sanket",96,'A'));
        list2.add(new Student("Amol",69,'D'));

        List<List<Student>> finalList=new ArrayList<>();
        finalList.add(list1);
        finalList.add(list2);

        List<Student> finalList1=finalList.stream().flatMap(x->x.stream()).collect(Collectors.toList());
        System.out.println(finalList1);

        //After Sorting
        Comparator<Student> studentComparator=(p1,p2)->p1.sMark-p2.sMark;
        finalList1.stream().sorted(studentComparator).forEach(System.out::println);
    }
}
