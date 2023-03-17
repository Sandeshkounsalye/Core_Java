package Oop.Abstraction.Interface.Assignment.AssignFI;

public class DataInputStream implements InputStreamOpener{
    @Override
    public String open(String a) {
        return a;
    }

    public static void main(String[] args) {
        //1.Traditional Way
        InputStreamOpener ip=new DataInputStream();
        System.out.println(ip.open("Data Input Stream Traditional Way...."));

        //2.Anonymous Way
        InputStreamOpener ip1=new InputStreamOpener() {
            @Override
            public String open(String a) {
                return a;
            }

        };
        System.out.println(ip1.open("Data Input Stream Anonymous Way....."));

        //3.Lambda Way
        InputStreamOpener ip2=(a)->a;
        System.out.println(ip2.open("Data Input Stream Lambda Way....."));
    }
}
