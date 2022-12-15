package User.PersonalData;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class BiometricDataService {

    BiometricData bioData = new BiometricData();
    public BiometricData bioData(){
        bioData().setHeight();
        bioData().setWeight();
        bioData().setBirthDate();
        return new BiometricData();
    }

    BiometricData getBioData = new BiometricData();
    public BiometricData getBioData(){
        getBioData().getWeight();
        getBioData().getHeight();
        getBioData().getBirthDate();
        return new BiometricData();
    }




}
