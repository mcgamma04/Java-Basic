package fileoperations;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {

        //create file
        File file =  new File("users.txt");
        if(!file.exists()){
            //createNewFile();
            try {
                file.createNewFile();
                System.out.println("File "+file.getName()+" has been created ");
            }catch (IOException ee){
                ee.printStackTrace();
            }
        }else{
            System.out.println("File already exist");
        }
    }
}
