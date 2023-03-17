package Oop.Inheritance;

public class Main {
    public static void main(String[] args) {
        TwoV twoV=new TwoV();
        twoV.m1();
        twoV.setColor("Gray");
        twoV.setSpeed(110);
        System.out.println("Two Wheeler Color :"+twoV.getColor());
        System.out.println("Two Wheeler Max speed is :"+twoV.getSpeed());

        twoV.setColor("Yellow");
        System.out.println("Two Wheeler Color :"+twoV.getColor());
    }


}
