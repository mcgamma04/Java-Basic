package jdbc;

import javax.swing.*;

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
            System.out.println("[[ 1: Search  Student  ]]");
            System.out.println("[[ 1: Delete  Student  ]]");
            System.out.println("[[ 1: Update  Student  ]]");
            System.out.println("[[ 0: Exit             ]]");
            System.out.println("************************");

          choice =Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your choice","Aptech",JOptionPane.INFORMATION_MESSAGE));
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

            }
        }while(choice !=0);
    }
}
