package FileHandling;

import java.io.File;
import java.io.IOException;

public class Delete {
    public static void main(String[] args) throws IOException {

        //Delete file
        File file =new File("Abc1.txt");
        System.out.println("Delete file "+file.delete());

        //Delete folder
        File folder =new File("Sandesh");
        System.out.println("Delete Folder "+folder.delete());

    }
}
