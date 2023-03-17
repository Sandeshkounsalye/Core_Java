package method;

public class assignment1bylocal {
    int side1;
    int side2;
    int side3;

    void m1(int a,int b,int c){
        side1=a;
        side2=b;
        side3=c;
    }

   void perimeter(){
        int c= side1+side2+side3;
       System.out.println("Perimeter of triangle = "+c);

   }

    public static void main(String[] args) {
        assignment1bylocal assignment1bylocal=new assignment1bylocal();
        assignment1bylocal.m1(12,8,10);
        assignment1bylocal.perimeter();

    }
}
