package Ex1_2;

import java.util.Scanner;

public class MassCalculator {
    private static double mass;

    private static void enterMass() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter mass:");
        mass = scanner.nextDouble();
    }

    private static double convertToMilligrams(){
        return mass*1000000;
    }

    private static double convertToGrams(){
        return mass*1000;
    }

    private static double convertToTons(){
        return mass/1000;
    }

    private static void outputAllConversions()
    {
        System.out.println("Mass in kilograms: " + mass);
        System.out.println("Mass in milligrams: " + convertToMilligrams());
        System.out.println("Mass in grams: " + convertToGrams());
        System.out.println("Mass in tons: " + convertToTons());
    }

    public static void main(String[] args) {
        enterMass();
        outputAllConversions();
    }
}
