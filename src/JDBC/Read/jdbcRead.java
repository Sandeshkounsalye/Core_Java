package JDBC.Read;

import java.sql.*;

public class jdbcRead {
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
        ResultSet resultSet =statement.executeQuery("select * from product");
        while (resultSet.next()){
            System.out.println(resultSet.getInt("id")
                    +"\t"+resultSet.getString("name")
                    +"\t"+resultSet.getInt("price")   );
        }
        //4.Close connection
        connection.close();
    }
}
