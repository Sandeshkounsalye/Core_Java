package ImportantPrograms;

public class PalindromeNumber {

    //sos - palindrome

    public static void main(String[] args) {

        String str="sos";
        String str1="";

        for (int i=str.length()-1 ; i>=0 ; i--){
             str1=str1 + str.charAt(i);
        }
        System.out.println(str1);
        String output=str.equals(str1)?"is palindrome":"not palindrome";
        System.out.println(output);



    }
}
