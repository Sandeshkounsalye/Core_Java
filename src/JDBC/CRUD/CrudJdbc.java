package JDBC.CRUD;

import java.sql.*;
import java.util.Scanner;

public class CrudJdbc {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);

        String url = "jdbc:mysql://localhost:3306/student";
        String userName = "root";
        String password = "sandesh123";
        Connection connnection = DriverManager.getConnection(url, userName, password);

        int ch;
        do {
            System.out.println("1.Insert Record");
            System.out.println("2.Display All Records");
            System.out.println("3.Search Record");
            System.out.println("4.Delete Record");
            System.out.println("5.Update Record");
            System.out.println("0.Exit");
            System.out.print("Enter Your Choice : ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter Product Name : ");
                    String name=sc.next();
                    System.out.print("Enter Product Price : ");
                    int price=sc.nextInt();
                    System.out.print("Enter Product Colour : ");
                    String colour=sc.next();

                    String query="Insert into product(name,price,colour) values(?,?,?)";

                    PreparedStatement preparedStatement=connnection.prepareStatement(query);
                    preparedStatement.setString(1,name);
                    preparedStatement.setInt(2,price);
                    preparedStatement.setString(3,colour);

                    int executeUpdate=preparedStatement.executeUpdate();
                    System.out.println("Data Added successfully");

                    break;

                case 2:
                    System.out.println("These are all records");
                    Statement statement1 =connnection.createStatement();
                    ResultSet resultSet =statement1.executeQuery("select * from product");
                    while (resultSet.next()){
                        System.out.println("----------------------------");
                        System.out.println(resultSet.getInt("id")
                                +"\t"+resultSet.getString("name")
                                +"\t"+resultSet.getInt("price")
                                +"\t"+resultSet.getString("colour"));
                    }
                    System.out.println("==========================");
                    break;

                case 3:
                    System.out.print("Enter Id to Search Record : ");
                    int id2=sc.nextInt();
                    PreparedStatement statement=connnection.prepareStatement("select * from product where id=?");
                    statement.setInt(1,id2);
                    ResultSet resultSet1=statement.executeQuery();
                    while (resultSet1.next()){
                        System.out.println("======================");
                    System.out.println(resultSet1.getInt("id")
                                        +"-"+resultSet1.getString("name")
                                         +"-"+resultSet1.getInt("price")
                                           +"-"+resultSet1.getString("colour"));
                        System.out.println("======================");}

                    break;

                case 4:
                    System.out.println("Enter Id Delete Record");
                    int id=sc.nextInt();
                    Statement statement2=connnection.createStatement();
                    statement2.execute("delete from product where id='"+id+"'");

                    System.out.println("Record Deleted Successfully");
                    break;

                case 5:
                    System.out.print("Enter Product id to Update Price : ");
                    int id1=sc.nextInt();
                    System.out.print("Enter New Price : ");
                    int price1=sc.nextInt();
                    Statement statement3=connnection.createStatement() ;
                    statement3.executeUpdate("update product set price='"+price1+"' where id='"+id1+"'  ");
                    System.out.println("Record Updated Successfully");
                    break;

//                    System.out.println("Enter Product id to Update Price : ");
//                    int id1=sc.nextInt();
//                    System.out.print("Enter New Price : ");
//                    int price1=sc.nextInt();
//
//                    PreparedStatement preparedStatement1=connnection.prepareStatement("update  product set price=? where id=?");
//                    preparedStatement1.setInt(1,id1);
//                    preparedStatement1.setInt(2,price1);
//                    int executeUpdate1=preparedStatement1.executeUpdate();
//                    System.out.println("Data updated ");



            }
        } while (ch != 0);
        System.out.println("==========================");
        System.out.println("Thank You ....!!!");
        System.out.println("==========================");
        // Close connection
        connnection.close();

    }
}
