package fileoperations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    public static void main(String[] args) {
        File file =  new File("users.txt");
        String msg ="This is Aptech Port Harcourt";
        String msg2 = "MBM plaza old aba road, Port Harcourt";
        String[] names =  {"Onyeka","Kingg","Jedi","Faithful"};
        try {
            FileWriter fwrite = new FileWriter(file);
            fwrite.write(msg);

            fwrite.write("\n"+msg2);
            for(String name :names) {
                fwrite.append("\n" + name);
            }
            System.out.println("File has been written suucessfully");
            fwrite.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
