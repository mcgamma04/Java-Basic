package jdbc;

import java.sql.*;

public class Database {
    Connection connection;
    public boolean connectDB(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "");
             return true;
        }catch (SQLException  sql){
            sql.printStackTrace();
            return false;
        }
        }

        public Connection getConnection(){
        return  connection;
        }

}
