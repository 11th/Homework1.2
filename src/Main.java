public class Main {
    public static void main(String[] args) {
        //Task 1
        byte ageYears = 35;
        short size = 48;
        int height = 177;
        long ageMonths = 420L;
        float width = 90.1f;
        double weight = 71.5;
        char nameFirstLiter = 68;
        boolean isMale = true;

        //Task 2
        float boxerOneWeight = 78.2f;
        float boxerTwoWeight = 82.7f;
        float sumWeight = boxerOneWeight + boxerTwoWeight;
        float deltaWeight = boxerTwoWeight - boxerOneWeight;
        System.out.println("Sum weight of both boxers = " + sumWeight + " kg");
        System.out.println("Delta weight between boxers = " + deltaWeight + " kg");

        //Task 3
        int bananasCount = 5;
        int bananasWeight = 80;
        int milkCount = 2;
        int milkWeight = 105;
        int iceCreamCount = 2;
        int iceCreamWeight = 100;
        int agsCount = 4;
        int agsWeight = 70;
        int weightGrams = (bananasCount * bananasWeight) + (milkCount * milkWeight) +
                (iceCreamCount * iceCreamWeight) + (agsCount * agsWeight);
        float weightKilos = weightGrams / 1000f;
        System.out.println("Weight in gr = " + weightGrams);
        System.out.println("Weight in kg = " + weightKilos);

        //Task 4
        int weightNeedLeft = 7;
        int minWeightPerDay = 250;
        int maxWeightPerDay = 500;
        int minDays = weightNeedLeft * 1000 / maxWeightPerDay;
        int maxDays = weightNeedLeft * 1000 / minWeightPerDay;
        int averageDays = (maxDays + minDays) / 2;
        System.out.println("Minimum days = " + minDays);
        System.out.println("Maximum days = " + maxDays);
        System.out.println("Average days = " + averageDays);

        //Task 5
        int percent = 10;
        int monthCount = 12;
        int salaryMasha = 67760;
        float salaryIncreaseMasha = salaryMasha * percent / 100f;
        int salaryDenis = 83690;
        float salaryIncreaseDenis = salaryDenis * percent / 100f;
        int salaryKris  = 76230;
        float salaryIncreaseKris = salaryKris * percent / 100f;
        System.out.println("Currently Masha's salary is " + (salaryMasha + salaryIncreaseMasha) + " rub. " +
                "Revenue increased by " + (salaryIncreaseMasha * monthCount) + " rub.");
        System.out.println("Currently Denis's salary is " + (salaryDenis + salaryIncreaseDenis) + " rub. " +
                "Revenue increased by " + (salaryIncreaseDenis * monthCount) + " rub.");
        System.out.println("Currently Kristina's salary is " + (salaryKris + salaryIncreaseKris) + " rub. " +
                "Revenue increased by " + (salaryIncreaseKris * monthCount) + " rub.");
    }
}