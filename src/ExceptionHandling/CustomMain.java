package ExceptionHandling;

public class CustomMain {
    public static void main(String[] args) throws NameCanNotBeNullException {
//      try {
//          CustomException1 ce=new CustomException1(0,"sandesh");
//          System.out.println(ce.getA());
//          System.out.println(ce.getName());
//      }catch (NameCanNotBeNullException n){
//          System.out.println("Enter valid Roll");
//      }
        CustomException1 ce=new CustomException1(0,"sandesh");
        CustomException1 ce1=new CustomException1(11,"Mahesh ");
        System.out.println(ce);
        System.out.println(ce1);
    }
}
