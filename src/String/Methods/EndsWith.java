package String.Methods;

public class EndsWith {
    public static void main(String[] args) {
        String str="method checks this string ends with a given value";
        System.out.println(str.endsWith("value"));//true
        System.out.println(str.endsWith("Value"));//false
    }
}
