package ClassComponent;

public class ConstructorDEMO {
    int a=10;
    int b=20;
    int c=99;

    public ConstructorDEMO() {
        this.c=c;
    }

    public ConstructorDEMO(int x, int y) {
        this.a = x;
        this.b = y;
    }
    void m1(){
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        ConstructorDEMO cd=new ConstructorDEMO(40,50);
        ConstructorDEMO cd1=new ConstructorDEMO(60,70);



        cd.m1();
        cd1.m1();


    }
}
