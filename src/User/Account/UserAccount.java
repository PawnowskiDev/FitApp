package User.Account;

import java.util.Scanner;

public class UserAccount {
    private String firstName;
    private static String lastName;
    private String userNick;
    private String email;
    private String password;

    // Other Methods
    Scanner input = new Scanner(System.in);
    public UserAccount() {
        setFirstName();
        setLastName();
        setUserNick();
        setEmail();
        setPassword();
    }

    //Constructor

    public UserAccount(String firstName, String lastName, String userNick, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userNick = userNick;
        this.email = email;
        this.password = password;
    }




    //Getters

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserNick() {
        return userNick;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    //Setters

    public void setFirstName() {
        System.out.println("Enter Your Name");
        String firstName = input.nextLine();
        this.firstName = firstName;
    }

    public void setLastName() {
        System.out.println("Enter Your Last Name");
        String lastName = input.nextLine();
        this.lastName = lastName;
    }

    public void setUserNick() {
        System.out.println("Enter Your Login");
        String userNick = input.nextLine();
        this.userNick = userNick;
    }

    public void setEmail() {
        System.out.println("Enter Your email");
        String email = input.nextLine();
        this.email = email;
    }

    public void setPassword() {
        System.out.println("Enter Your password");
        String password = input.nextLine();
        this.password = password;
    }

}

