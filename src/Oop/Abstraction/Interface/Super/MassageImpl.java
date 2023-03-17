package Oop.Abstraction.Interface.Super;

public class MassageImpl implements MassageService,MassageService2 {

    @Override
    public void sendMassage() {
        System.out.println("From MS");
    }

    @Override
    public void m1() {
        MassageService.super.m1();
        MassageService2.super.m1();
    }


    public static void main(String[] args) {
        MassageImpl massage=new MassageImpl();
        massage.sendMassage();


        MassageService2 massageService=new MassageImpl();
        massageService.m1();

        MassageService massageService1= new MassageService() {
            @Override
            public void sendMassage() {
                System.out.println("heiiiiiii");

            }
        };
        massageService1.m1();
        massageService1.sendMassage();

    }

}
