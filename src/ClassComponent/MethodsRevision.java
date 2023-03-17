package ClassComponent;

public class MethodsRevision {
    public int add(int a,int b){
        int c=a+b;
        System.out.println(c);
        return c;
    }
    static public void m2(){
        System.out.println("Static Method");
    }

    public static void main(String[] args) {
        MethodsRevision md=new MethodsRevision();
        md.add(10,20);
        MethodsRevision.m2();
    }


}
