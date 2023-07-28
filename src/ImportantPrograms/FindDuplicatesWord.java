package ImportantPrograms;

public class FindDuplicatesWord {
    public static void main(String[] args) {
        String str="Hi hello hi BYE hi he hey hello hi hey Bye hi";

        String str1=str.toLowerCase();
        String [] word=str1.split(" ");
        int count=0;

        for (int i = 0; i < word.length; i++) {
            for (int j = i+1; j < word.length ; j++) {
                if(word[i]==word[j]){
                    System.out.println(word[j]);
                    count++;
                }
            }
        }
    }
}
