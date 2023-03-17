package CRUD_operation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class CRUDDemo {
    public static void main(String[] args) {
        Collection<Employee> e=new ArrayList<Employee>();
        int ch ;
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        do {
            System.out.println("1.Insert");
            System.out.println("2.Display");
            System.out.println("3.Search");
            System.out.println("4.Delete");
            System.out.println("5.Update");
            System.out.print("Enter Your Choice : ");
            ch =sc.nextInt();
            switch(ch){
                case 1:
                    System.out.print("Enter Emp no : ");
                    int empno=sc.nextInt();
                    System.out.print("Enter Emp Name : ");
                    String ename=sc1.nextLine();
                    System.out.print("Enter Emp Salary : ");
                    int salary=sc.nextInt();
                    e.add(new Employee(empno,ename,salary));
                break;
                case 2:
//                    System.out.println(e);
//                    e.forEach(System.out::println);
                    //Displaying record by iterator
                    Iterator<Employee> i=e.iterator();
                    while (i.hasNext()){
                        Employee emp=i.next();
                    }
                    e.forEach(System.out::println);
                    break;
                case 3:
                    boolean found=false;
                    System.out.print("Enter Empno to Search :");
                    empno = sc.nextInt();
                    i=e.iterator();
                    while (i.hasNext()){
                        Employee e1=i.next();
                        if (e1.getEmpno() == empno){
                            System.out.println(e1);
                            found=true;
                        }
                    }
                    if (!found){
                        System.out.println("Record Not Found");
                    }
                    break;
                case 4:
                    found=false;
                    System.out.println("Enter Emp No to Delete : ");
                    empno=sc.nextInt();
                    i=e.iterator();
                    while (i.hasNext()){
                        Employee e2=i.next();
                        if (e2.getEmpno()==empno){
                          i.remove();
                        }
                    }
                    e.forEach(System.out::println);
                    if (!found){
                        System.out.println("Record not Found");
                    }
                    else {
                        System.out.println("Record Deleted ");
                    }

                    break;
                case 5:

                    break;
                default:

            }

        }while (ch != 0);
    }
}
