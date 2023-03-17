package JDBC.dml;

import java.sql.*;

public class DeleteRecord {
    public static void main(String[] args) throws SQLException {
        String url="jdbc:mysql://localhost:3306/student";
        String userName="root";
        String password="sandesh123";
        Connection connection= DriverManager.getConnection(url,userName,password);

        Statement statement=connection.createStatement();

        int executeUpdate =statement.executeUpdate("delete from product where name='charger'");
        System.out.println("Record Deleted");

        connection.close();
    }
}
