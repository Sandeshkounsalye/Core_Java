package JDBC.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class    InsertRecord {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.load the driver and register
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2.get connection
        String url="jdbc:mysql://localhost:3306/student";
        String userName="root";
        String password="sandesh123";
        Connection connection= DriverManager.getConnection(url,userName,password);

        //3.Execute queries
        Statement statement=connection.createStatement();
        int executeUpdate=statement.executeUpdate("insert into product(id,name,price) values(4,'mouse',1299)");
        System.out.println("Data Added successfully "+executeUpdate);

        //4.close connection
        connection.close();
    }
}
