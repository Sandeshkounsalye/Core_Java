package ImportantPrograms;

public class CountVolvesString {
    public static void main(String[] args) {

        String str="I am FullStack Developer";
        int count=0;
        int collect=0;
        int counts=0;

        String st=str.toLowerCase();

        for (int i = 0; i < st.length() ; i++) {
            if (st.charAt(i)=='a'||st.charAt(i)=='e'||st.charAt(i)=='i'||
                    st.charAt(i)=='o'|| st.charAt(i)=='u'||st.charAt(i)==' '){
                count++;
            }
        }
        System.out.println(count);























        System.out.println("Repeate a: ");
        for (int i = 0; i < st.length() ; i++) {
            if(st.charAt(i)=='a'){
                counts++;
            }
        }
        System.out.println(counts);
    }
}
