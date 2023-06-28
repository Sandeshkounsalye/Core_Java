package String.Revision;

public class PalindromeString {

    public static void main(String[] args) {

        String str="moml";
        String reverse="";

        for (int i = str.length() -1; i >= 0 ; i--) {
             reverse=reverse+str.charAt(i);
        }
        System.out.println("Is this string is Palindrome : "+reverse.equals(str));


        String k=10+20+"ABC"+(10+20);
        System.out.println(k);
    }
}
