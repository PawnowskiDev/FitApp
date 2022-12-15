package Menu;

import User.Account.UserAccount;
import User.PersonalData.BiometricData;

import java.util.Scanner;

public class MenuChoiceService {

    public MenuChoiceService(){
        menuService();
    }

    public static void  menuService() {

     int choiceMenu;
     Scanner inputMenu = new Scanner(System.in);

     do {
         System.out.println("Welcome in FitApp Menu!");
         System.out.println("(1) - Create Your Account");
         System.out.println("(2) - Calculate you BMI");
         System.out.println("(3) - Check how many calories You should eat");
         System.out.println("(4) - Quit");

         choiceMenu = inputMenu.nextInt();
     }
     while(choiceMenu > 5);

     switch(choiceMenu){

         case 1:
         // create your account//
             UserAccount userAccount = new UserAccount();
                break;
         case 2:
         // calculate your bmi
             BiometricData getBioData = new BiometricData();
             break;
         case 3:
         // how many calories
             break;
         case 4:
             // quit
             break;
     }

     // bad menu choice

     if(choiceMenu > 4 || choiceMenu < 1){
         System.out.println("This is not Valid Menu Option! Please Select Another.");
         do {
             choiceMenu = inputMenu.nextInt();
         }
         while (choiceMenu < 6);
     }



 }

}
