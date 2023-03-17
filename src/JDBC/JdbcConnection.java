package JDBC;

import java.sql.*;

public class JdbcConnection  {
    public static void main(String[] args) throws SQLException {
        String url ="jdbc:mysql://localhost:3306/student";
        String username="root";
        String password="sandesh123";
        Connection connection= DriverManager.getConnection(url,username,password);
        String query="select * from personal1";

        Statement statement=connection.createStatement();

        ResultSet resultSet= statement.executeQuery(query);
        while (resultSet.next()){
            System.out.println(resultSet.getInt(1)+"-"+resultSet.getString(2)+
                    "-"+resultSet.getString(3));
        }
        connection.close();
    }
}
