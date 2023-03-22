package Csj28.PanVerify;

public class TestPanCard {
    public static void main(String[] args) {
        PanCardServiceProvider obj=new PanCardServiceProvider() {
            @Override
            public boolean validatePanNumber(String panNumber) {
                String regEX="[A-Z]{5}[0-9]{4}[A-Z]{1}";
                if (panNumber.matches(regEX)){
                    return true;
                }
                return false;
            }
        };
        boolean status=obj.validatePanNumber("GNNPK2121L");
        if (status){
            System.out.println("Valid Pan Number");
        }
        else {
            System.out.println("Invalid Pan Number");
        }
    }
}
