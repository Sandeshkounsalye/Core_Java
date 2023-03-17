package JDBC.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementJdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.load driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2.Get connection
        String url="jdbc:mysql://localhost:3306/student";
        String userName="root";
        String password="sandesh123";
        Connection connection= DriverManager.getConnection(url,userName,password);

        //3.Execute Query
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter product id,name,price,Color");
         int id=sc.nextInt();
        String name=sc.next();
        int price=sc.nextInt();
        String colour=sc.next();

        String query="insert into product(id,name,price,colour) values(?,?,?,?)";

        PreparedStatement statement=connection.prepareStatement(query);
        statement.setInt(1,id);
        statement.setString(2,name);
        statement.setInt(3,price);
        statement.setString(4,colour);

        int executeUpdate=statement.executeUpdate();
        System.out.println("Data Added successfully"+executeUpdate);

        //5.Close Connection
        connection.close();
    }
}
