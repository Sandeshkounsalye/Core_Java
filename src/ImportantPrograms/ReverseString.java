package ImportantPrograms;

public class ReverseString {
    public static void main(String[] args) {

        String string1="sandesh";
        char [] a=string1.toCharArray();

        for (int i = string1.length()-1; i >=0; i--) {
            System.out.print(a[i]);
        }
        System.out.println();












        System.out.println("_________________________");

        int left,right=0;
        right=a.length-1;
        for ( left = 0; left < right; left++,right--) {
            char temp=a[left];
            a[left]=a[right];
            a[right]=temp;
        }
        for (char c :a){
            System.out.print(c);
        }

    }
}
