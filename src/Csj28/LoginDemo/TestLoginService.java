package Csj28.LoginDemo;

public class TestLoginService {
    public static void main(String[] args) {
        //i am login giving input tonlogin object
        Login login1=new Login("admin","admin@123");
        LoginService service=(login)->{
          if(login.getUserName().equalsIgnoreCase("admin")&&login.getUserPassword().equalsIgnoreCase("admin@123")){
              return true;
          }
          return false;
        };
        boolean b= service.doLogin(login1);
        if (b){
            System.out.println("You Are Admin");
        }
        else {
            System.out.println("Invalid Authentication");
        }

    }
}
