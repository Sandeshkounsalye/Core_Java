package method;

public class demo {
    public static void m1(){
        int i=0;
        System.out.println("m1"+i);
    }
    public static void main(String[] args) {
        int num=50*12;
        System.out.println(num);
        for(int i=1;i<=10;i++){
            m1();
        }

    }
}
