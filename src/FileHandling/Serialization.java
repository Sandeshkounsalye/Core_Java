package FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String[] args) throws IOException {
        Student student=new Student(102,"Sandesh",24);
        Student student1=new Student(103,"Mahesh",21);
        File file=new File("Stu_Data.txt");
        file.createNewFile();

        FileOutputStream fileOutputStream=new FileOutputStream(file);
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(student1);
        objectOutputStream.writeObject(student);
        System.out.println("Object is stored Serialized ");

    }
}
