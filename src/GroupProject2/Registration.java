package GroupProject2;

public class Registration {
    private String email;
    private String userName;
    private String password;


    public void setEmail(String email) {
        this.email = email;
        if (email.contains("yahoo")) {
            System.out.println(email);
        } else {
            System.out.println("Invalid Email");
        }
    }

    public void setUserName(String userName) {
        this.userName = userName;
        if (!userName.isEmpty() && userName.length() > 6) {
            System.out.println(userName);
        } else {
            System.out.println("Invalid Username");
        }
    }

    public void setPassword(String password) {
        this.password = password;
        if (!password.isEmpty() && !password.contains(userName) && password.length() > 6) {
            System.out.println(password);
        } else {
            System.out.println("Invalid password");
        }
    }
}



