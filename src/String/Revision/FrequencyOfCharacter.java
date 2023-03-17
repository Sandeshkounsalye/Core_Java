package String.Revision;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str="Hello here sandesh";
        int count=0;
        char character='e';
        System.out.println(str.length());

        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i)==character)
                count++;
        }
        System.out.println(count);
    }
}
