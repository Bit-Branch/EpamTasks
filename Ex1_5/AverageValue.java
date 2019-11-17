package Ex1_5;

import java.util.Scanner;

public class AverageValue {
    private static String enteredNumber;
    private static int numberConstituents[] = new int[6];

    private static void enterNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a six digit number:");
        enteredNumber = scanner.nextLine();
    }

    private static void decomposeNumber(){
        for (int i = 0; i<numberConstituents.length; i++)
            numberConstituents[i] = Character.getNumericValue(enteredNumber.charAt(i));
    }

    private static int multiplyNumbers(){
        int composition = 1;
        for (int number: numberConstituents
             ) {
            composition *= number;
        }
        return composition;
    }

    private static int addUpNumbers(){
        int sum = 0;
        for (int number: numberConstituents
        ) {
            sum += number;
        }
        return sum;
    }

    private static double calculateGeometricMean(){
        return Math.pow(multiplyNumbers(), 1.0/6.0);
    }

    private static double calculateArithmeticMean(){
        return addUpNumbers()/6.0;
    }

    private static void outputResult(){
        System.out.println("Arithmetic mean: " + calculateArithmeticMean());
        System.out.println("Geometric mean: " + calculateGeometricMean());
    }

    public static void main(String[] args) {
        enterNumber();
        decomposeNumber();
        outputResult();
    }
}
