package jdbc;


import  java.sql.*;
public class StudentController {
    Database db =  new Database();

    public boolean saveStudent(Student student){
        int upd;
        String INSERT = "INSERT INTO student(firstname,lastname,email,password) VALUES(?,?,?,?)";
       if(db.connectDB()){

           try {
               PreparedStatement ps = db.getConnection().prepareStatement(INSERT);
               ps.setString(1,student.getFirstname());
               ps.setString(2,student.getLastname());
               ps.setString(3,student.getEmail());
               ps.setString(4,student.getPassword());
               upd =  ps.executeUpdate();
               if (upd==0){
                   return false;
               }else{
                   System.out.println(upd+" record inserted");
               }

           } catch (SQLException e) {
               e.printStackTrace();
           }

       }
        return true;
    }

}
