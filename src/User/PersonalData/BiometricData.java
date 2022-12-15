package User.PersonalData;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class BiometricData {

    public BiometricData(){
    setHeight();
    setWeight();
    setBirthDate();
    getHeight();
    getWeight();
    getBirthDate();
    }




    private static int height;
    private static double weight;
    private static String birthDate;



    // Getters

    public static int getHeight() {
        return height;
    }

    public static double getWeight() {
         return weight;
    }

    public static String getBirthDate(){
        return birthDate;
    }

    public void setHeight() {
        System.out.println("Enter Your Height");
        Scanner inputHeight = new Scanner(System.in);
        inputHeight.nextInt();
        while (height > 0 && height < 250) {
            System.out.println("Thank You");
        }
                System.out.println("Enter Value from 0 to 250");
                     inputHeight.nextInt();
                        this.height = height;
    }

    public void setWeight() {
        System.out.println("Enter Your Weight");
        Scanner inputWeight = new Scanner(System.in);
        inputWeight.nextDouble();
        while (weight > 0 && weight < 250) {
            System.out.println("Thank You");
        }
                System.out.println("Enter Value from 0 to 250");
                    inputWeight.nextDouble();
                        this.weight = weight;
    }

    public static void setBirthDate() {
        System.out.println("Enter Your birth date");
        System.out.println("Use Format: yyyy-mm-dd");
        Scanner inputBirth = new Scanner(System.in);
        String birth = inputBirth.next();
        LocalDate dateOfBirth = LocalDate.parse(birth);
        LocalDate currentData = LocalDate.now();
        Period period = Period.between(currentData, dateOfBirth);
        int age = Math.abs(period.getYears());
        System.out.println("You are: " + age + " years old!");
        BiometricData.birthDate = birthDate;
    }
}



