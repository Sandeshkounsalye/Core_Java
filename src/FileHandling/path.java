package FileHandling;

import java.io.File;

public class path {
    public static void main(String[] args) {
        File file = new File("Abc1.txt");
        //length of file
        System.out.println("Length of file : "+file.length());

        //it is file or folder
        System.out.println("Its file "+file.isFile());
        System.out.println("Its folder "+file.isDirectory());

        //get path
        System.out.println("File complete path : "+file.getAbsolutePath());
        System.out.println("File Relative path : "+file.getPath());
    }
}
