package ImportantPrograms;

public class RemoveDuplicateChar {
    public static void main(String[] args) {

        String str="sandesh";

        StringBuffer sb=new StringBuffer();

        str.chars().distinct().forEach(c->sb.append((char)c));
        System.out.println(sb);
    }
}
