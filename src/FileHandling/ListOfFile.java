package FileHandling;

import java.io.File;

public class ListOfFile {
    public static void main(String[] args) {

        File file=new File("src/Patterns");
        File [] files = file.listFiles();

        System.out.println("Number of file : "+files.length);
        System.out.println(file.length());

    }
}
