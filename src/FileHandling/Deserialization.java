package FileHandling;

import java.io.*;

public class Deserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file=new File("Stu_Data.txt");

        FileInputStream fileInputStream=new FileInputStream(file);
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);

        System.out.println(objectInputStream.readObject());


    }
}
