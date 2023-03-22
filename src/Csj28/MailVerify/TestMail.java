package Csj28.MailVerify;

public class TestMail {
    public static void main(String[] args) {
        MailService mailService=mail ->{
            String regEX="[a-z]{7}[@]{1}[a-z]{5}[.]{1}[a-z]{3}";

            if(mail.matches(regEX)){
                return true;
            }
            return false;
        };
        boolean status= mailService.validateMail("sandesh@gmail.com");
        if (status){
            System.out.println("Valid Mail");
        }
        else {
            System.out.println("Invalid Mail");
        }
    }
}
