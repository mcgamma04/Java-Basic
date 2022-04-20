package fileoperations;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("usersCopy.txt");
        if(file.exists()){
            file.delete();
            System.out.println("File deleted "+file.getName()+" successfully ");
        }
    }
}
