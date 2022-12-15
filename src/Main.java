import Menu.MenuChoiceService;
import User.Account.UserAccount;
import User.Account.UserAccountService;
import User.PersonalData.BiometricData;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Create Account, follow steps");
        // UserAccount userAccount = new UserAccount();

        MenuChoiceService menuService = new MenuChoiceService();

        System.out.println("Give more information about You");
        BiometricData bioData = new BiometricData();


    }
}