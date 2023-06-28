package ImportantPrograms;

public class PalindromeNumber {

    //434 - palindrome
    //123 - not palindrome
    //sos - palindrome

    public static void main(String[] args) {

        String str="sos";
        int strLength=str.length();
        String str1="";
        for (int i=str.length()-1 ; i>=0 ; i--){
             str1=str1 + str.charAt(i);
        }
        System.out.println(str1);
        String output=str.equals(str1)?"is palindrome":"not palindrome";
        System.out.println(output);
    }
}
