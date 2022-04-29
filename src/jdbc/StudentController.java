package jdbc;


import jdbc.dbconnection.Database;
import jdbc.exceptions.RecordNotFoundExcecption;
import jdbc.models.Student;
import com.bethecoder.ascii_table.ASCIITable;
import jdbc.services.Studentduties;

import javax.swing.*;
import  java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentController implements Studentduties {
    Database db =  new Database();
    String name, email;
    String SEARCH =  "SELECT * FROM student WHERE email = ?";
    PreparedStatement ps;

    public boolean saveStudent(Student student){
        int upd;
        String INSERT = "INSERT INTO student(firstname,lastname,email,password) VALUES(?,?,?,?)";
       if(db.connectDB()){

           try {
                ps = db.getConnection().prepareStatement(INSERT);
               ps.setString(1,student.getFirstname());
               ps.setString(2,student.getLastname());
               ps.setString(3,student.getEmail());
               ps.setString(4,student.getPassword());
               upd =  ps.executeUpdate();
               if (upd==0){
                   return false;
               }else{
                   JOptionPane.showMessageDialog(null,upd+" record inserted successfully","aptech",JOptionPane.INFORMATION_MESSAGE);
                   System.out.println(upd+" record inserted");
               }

           } catch (SQLException e) {
               e.printStackTrace();
           }

       }
        return true;
    }

  public void displayAll(){
        if(db.connectDB()){
            String DISP = "SELECT * FROM student";
            try{
                 ps = db.getConnection().prepareStatement(DISP);
                ResultSet rs =  ps.executeQuery();
               System.out.println("Name\t\t\t+Email");
               // String [] tableHeaders = { "Student Name", "Email"};


                while(rs.next()){
                   name =  rs.getString("firstname")+" "+ rs.getString("lastname");
                   email =  rs.getString("email");
               System.out.println(name+"\t\t\t\t"+email);
//                    String[][] tableData = {
//                            { name,email },
//
//                    };
//
                   // ASCIITable.getInstance().printTable(tableHeaders, tableData);
                }
            }catch (SQLException sqlException){}
        }
  }

  public void Search(Student student){
      String [] tableHeaders = { "Student Name", "Email"};
        if(db.connectDB()){

            try {
                 ps = db.getConnection().prepareStatement(SEARCH);
                ps.setString(1,student.getEmail());
                ResultSet rs =  ps.executeQuery();
                if(rs.next()){
                    name =  rs.getString("firstname")+" "+ rs.getString("lastname");
                    email =  rs.getString("email");
                    String[][] tableData = {
                            { name,email },

                    };
ASCIITable.getInstance().printTable(tableHeaders, tableData);
//               System.out.println("no such record");
               //JOptionPane.showMessageDialog(null, new RecordNotFoundExcecption("no such record "),"Aptech",JOptionPane.ERROR_MESSAGE);

                }else{
                    throw new RecordNotFoundExcecption("Record not found");
                }

            }catch (SQLException sqlException){}
        }
  }

  public void update(Student student){
        String UPDATE =  "UPDATE student SET firstname =?, lastname = ? WHERE email = ?";
        if(db.connectDB()){
            try {
                ps = db.getConnection().prepareStatement(SEARCH);
                ps.setString(1,student.getEmail());
                ResultSet rs =  ps.executeQuery();
                String firstname, lastname;
                if(rs.next()){
                  email = rs.getString("email");
                  if(email.equalsIgnoreCase(student.getEmail())){
                       ps = db.getConnection().prepareStatement(UPDATE);
                      ps.setString(1, student.getFirstname());
                      ps.setString(2,student.getLastname());
                      ps.setString(3,student.getEmail());
                      int upd =  ps.executeUpdate();
                      if(upd==1){
                         JOptionPane.showMessageDialog(null,"Record Updated successfully");
                      }
                  }
                }

            }catch (SQLException sqlException){}

        }
  }
}
