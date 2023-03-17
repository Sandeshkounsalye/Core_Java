package method;

public class voteEligible {
    int a;

    public void setvote(int a) {
        this.a = a;
    }

    public void getvote() {
        if (a>=18){
            System.out.println("You can vote ");
        }
        else {
            System.out.println("Sorry You can't vote ");
        }
    }

    public static void main(String[] args) {
        voteEligible voteEligible=new voteEligible();
        voteEligible.setvote(30);
        voteEligible.getvote();
    }
}
