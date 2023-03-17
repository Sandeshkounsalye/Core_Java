package Oop.ObjectClass;

public class GetClassMethod {
    public static void main(String[] args) {
        GetClassMethod getClassMethod=new GetClassMethod();

        Class ref=getClassMethod.getClass();
        System.out.println(ref.getName());


        System.out.println("-------------------");
        System.out.println(getClassMethod.getClass());




//        Class innerClass = getClassMethod.getClass();
//        // System.out.println(getClassMethod.getClass());
//
//        System.out.println(innerClass.getName());

    }
}
