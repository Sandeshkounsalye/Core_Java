package UserInPut;

import java.util.Scanner;

public class AttendanceLess {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Number of classes held :");
        int a=scanner.nextInt();

        System.out.println("Number of Classes Attended :");
        int b=scanner.nextInt();

        int c=b*100/a;
        System.out.println("Attendance is "+c+" %");

        if(c<=75){
            System.out.println("Not Allowed to sit in Exam !");
        }
        else{
            System.out.println("Allowed to sit in Exam " +
                    "");
        }
    }
}
