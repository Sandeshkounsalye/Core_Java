package FileHandling;

import java.io.File;

public class Permission {
    public static void main(String[] args) {
        File file=new File("Abc1.txt");
        //Give permission
//        file.canExecute();
//        file.canWrite();
//        file.canRead();

        //change the permission
        file.setExecutable(false);
        file.setWritable(false);
        file.setReadable(false);

    }
}
