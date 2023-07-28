package operators;

public class IncrementDemo {
    public static void main(String[] args) {

         int a=10;

        System.out.println(a++); //10
        System.out.println(++a); //12
        System.out.println(a);   //12

        //Str: aaaabbbbcccc
        //output: aaaa
        //bbbb
        //ccc

        String str="sandesh";
        char [] chars=str.toCharArray();
        for (int i = str.length()-1; i>=0 ; i--) {
            System.out.print(chars[i]);
        }
    }
}
