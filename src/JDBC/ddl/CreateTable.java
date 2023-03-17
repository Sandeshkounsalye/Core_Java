package JDBC.ddl;

import java.sql.*;

public class CreateTable {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //1.load and register the driver with driver-manager
//        Class.forName("com.mysql.cj.jdbc.driver");

        //2.Get connection
        String url="jdbc:mysql://localhost:3306/student";
        String userName="root";
        String password="sandesh123";
        Connection connection= DriverManager.getConnection(url,userName,password);

        //3.Execute Queries
        Statement statement=connection.createStatement();
        String createTable="create table product(id int primary key auto_increment,name varchar(20),price int )";

        boolean isTableCreated = statement.execute(createTable);
        System.out.println("Table created successfully "+isTableCreated);

        //Close connection
        connection.close();
    }
}
