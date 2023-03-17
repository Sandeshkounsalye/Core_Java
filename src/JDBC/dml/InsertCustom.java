package JDBC.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertCustom {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.load driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2.Get Connection
        String url="jdbc:mysql://localhost:3306/student";
        String userName="root";
        String password="sandesh123";
        Connection connection= DriverManager.getConnection(url,userName,password);

        //3.Execute queries
        Statement statement=connection.createStatement();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter product id, name, price");
        int id=sc.nextInt();
        String name=sc.next();
        int price=sc.nextInt();

        String query="insert into product" +
                "(id, name, price)" +
                "values('"+id+"','"+name+"','"+price+"')";

        int executeUpdate=statement.executeUpdate(query);

        System.out.println("Data inserted Successfully"+executeUpdate);

        //4.
        //5.Close Connection
        connection.close();
    }
}
