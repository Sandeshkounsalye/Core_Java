package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {
    public static void main(String[] args) throws IOException {
        File file =new File("Abc1.txt");

        //Create new file
       boolean fileCreated= file.createNewFile();
        System.out.println(fileCreated);

        //Create new folder
        File folder=new File("Sandesh");
        boolean folderCreated=folder.mkdir();
        System.out.println(folderCreated);
    }
}
