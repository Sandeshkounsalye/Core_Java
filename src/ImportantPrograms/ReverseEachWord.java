package ImportantPrograms;

public class ReverseEachWord {
    public static void main(String[] args) {

        System.out.println("Reverse Each word"+ReverseEachWord.reverseEachWord("I am Java Developer"));
    }
   public static String reverseEachWord(String str){
       if(str==null || str.isEmpty()){

       }
       String reverse=" ";
       for(int i=str.length()-1;i>=0;i++){
           reverse = reverse+str.charAt(i);
       }
       return reverse;
   }
}
