package ClassComponent;

public class InstanceMethod {
    //Instance Method
   public int  add(int a,int b){
       int c=a+b;
       System.out.println("Sum of a & b :"+c);
       return c;
   }
   public void m3(){
       int x=40;
       int y=50;
       int z=x+y;
       System.out.println(z);
   }

   //Static Method
   static void  m2(){
       System.out.println("Static Method");
   }

    public static void main(String[] args) {
       // Class ref=new class
        InstanceMethod instanceMethod=new InstanceMethod();
        instanceMethod.add(10,30);
        InstanceMethod.m2();

        instanceMethod.m3();
    }
}
