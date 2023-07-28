package ImportantPrograms;

public class ReverseStringWord {
    public static void main(String[] args) {
        String str = "Java is programming language";

        String word[] = str.split(" "); //here we are spliting the string in array
        String str1 = "";

        for (int i = 0; i < word.length ; i++) {
            str1=" "+word[i]+str1;
        }
        System.out.println(str1.trim());
    }
}