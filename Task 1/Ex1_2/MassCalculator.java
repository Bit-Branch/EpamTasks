package Ex1_2;

import java.util.Scanner;

public class MassCalculator {
    private static double mass;
    private static final int MG_IN_KG = 1000000;
    private static final int G_IN_KG = 1000;
    private static final int KG_IN_T = 1000;

    private static void enterMass() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter mass:");
        mass = scanner.nextDouble();
    }

    private static double convertToMilligrams(){
        return mass*MG_IN_KG;
    }

    private static double convertToGrams(){
        return mass*G_IN_KG;
    }

    private static double convertToTons(){
        return mass/KG_IN_T;
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
