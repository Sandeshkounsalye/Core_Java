package JDBC.dml;

import java.sql.*;

public class UpdateRecord {
    public static void main(String[] args) throws SQLException {
        String url="jdbc:mysql://localhost:3306/student";
        String userName="root";
        String password="sandesh123";
        Connection connection= DriverManager.getConnection(url,userName,password);

        Statement statement=connection.createStatement();

        int executeUpdate =statement.executeUpdate("update product" +
                " set name='Mouse'" +
                "where id=4");
        System.out.println("Data Updated successfully "+executeUpdate);
        connection.close();

    }
}
