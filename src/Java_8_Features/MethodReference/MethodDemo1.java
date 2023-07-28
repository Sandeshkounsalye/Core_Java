package Java_8_Features.MethodReference;

interface Sayable{
    void m1();
}

 class MethodDemo1 {

    public static void m2(){
        System.out.println("Hello, Method :-");
    }

     public static void main(String[] args) {
         Sayable sayable=MethodDemo1::m2;
         sayable.m1();
     }
}
