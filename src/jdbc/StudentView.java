package jdbc;

import jdbc.exceptions.WrongOption;
import jdbc.models.Student;

import javax.swing.*;
import java.sql.SQLException;

public class StudentView {
    Student std = new Student();
    StudentController str = new StudentController();
    public void outPut(){
        int choice;
        do{
            System.out.println("***********************");
            System.out.println("___SELECT FROM MENU___");
            System.out.println("[[ 1: Add Student     ]]");
            System.out.println("[[ 2: Display Student ]]");
            System.out.println("[[ 3: Search  Student  ]]");
            System.out.println("[[ 4: Delete  Student  ]]");
            System.out.println("[[ 5: Update  Student  ]]");
            System.out.println("[[ 0: Exit             ]]");
            System.out.println("************************");

          choice =Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your choice\n1: Add Student\n2: Display Student\n3:Search\nUpdate\n5:Delete\n0:Exit","Aptech",JOptionPane.INFORMATION_MESSAGE));
            switch (choice){
                case 1:
                     String fname =JOptionPane.showInputDialog(null,"Enter your Firstname","Aptech",JOptionPane.INFORMATION_MESSAGE);
                    String lname =JOptionPane.showInputDialog(null,"Enter your Lastname","Aptech",JOptionPane.INFORMATION_MESSAGE);
                    String email =JOptionPane.showInputDialog(null,"Enter your Email","Aptech",JOptionPane.INFORMATION_MESSAGE);
                    String password =JOptionPane.showInputDialog(null,"Enter your Password","Aptech",JOptionPane.INFORMATION_MESSAGE);
                    std.setFirstname(fname);
                    std.setLastname(lname);
                    std.setEmail(email);
                    std.setPassword(password);
                    str.saveStudent(std);
                    break;
                case 2:
                    str.displayAll();
                    break;
                case 3:
                    String ema =JOptionPane.showInputDialog(null,"Enter your Email","Aptech",JOptionPane.INFORMATION_MESSAGE);
                    std.setEmail(ema);
                    str.Search(std);
                case 4:
                    String emai =JOptionPane.showInputDialog(null,"Enter your Email","Aptech",JOptionPane.INFORMATION_MESSAGE);
                    String fname1 =JOptionPane.showInputDialog(null,"Enter your Firstname","Aptech",JOptionPane.INFORMATION_MESSAGE);
                    String lname1 =JOptionPane.showInputDialog(null,"Enter your Lastname","Aptech",JOptionPane.INFORMATION_MESSAGE);
                    std.setEmail(emai);
                    std.setFirstname(fname1);
                    std.setLastname(lname1);
                    str.update(std);
                    break;
                case 5:
                    String emaii =JOptionPane.showInputDialog(null,"Enter your Email","Aptech",JOptionPane.INFORMATION_MESSAGE);
                    std.setEmail(emaii);
                    str.delete(std);
                    break;
                default:
                      throw new WrongOption("Wrong input");
            }
        }while(choice !=0);
    }
}
