package Csj28.LoginDemo;

public class Login {
    private String userName;
    private String userPassword;

    public Login(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }
}
