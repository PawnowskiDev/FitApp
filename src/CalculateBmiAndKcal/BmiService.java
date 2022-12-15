package CalculateBmiAndKcal;

import User.PersonalData.BiometricData;

public class BmiService {
    BiometricData getBioData = new BiometricData();
    public BiometricData getGetBioData() {
        double BMI = getBioData.getHeight() / (getBioData.getWeight() * getBioData.getWeight());
        return new BiometricData();
    }
}
