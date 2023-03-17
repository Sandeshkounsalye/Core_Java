package String.Methods;

public class Split {
    public static void main(String[] args) {
        String str="Hello good Morning Everyone";
        String [] str1=str.split("\\s");
        for (String w:str1) {
            System.out.println(w);

        }
    }
}
