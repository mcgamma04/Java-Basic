package fileoperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public static void main(String[] args) {
        File file =  new File("users.txt");
        try {
//            FileReader read = new FileReader();
//            System.out.println(read);
            BufferedReader reader =  new BufferedReader(new FileReader(file));
//            System.out.println(reader.readLine());
             String lines;
            System.out.println("----------------------");
             while((lines = reader.readLine())!=null){
                 System.out.println(lines);
             }
            System.out.println("------------------------");
        }catch (IOException io){
            System.out.println("Unable to read from from file "+io.getMessage());
        }
    }
}
