package Ex1_1;

import java.util.Scanner;

public class Validator {
    private static double mas[] = new double[3];

    private static void enterNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        for (int i=0;i<3;i++)
            mas[i] = scanner.nextDouble();
    }

    private static String compareNumbers() {
        String equalNumbers = "none";
        boolean firstEquality = mas[0] == mas[1];
        boolean secondEquality = mas[1] == mas[2];
        boolean thirdEquality = mas[0] == mas[2];

        if (firstEquality && secondEquality)
            equalNumbers = "all numbers";
        else if (firstEquality)
            equalNumbers = "only A and B";
        else if (secondEquality)
            equalNumbers = "only B and C";
        else if (thirdEquality)
            equalNumbers = "only A and C";
        return equalNumbers;
    }

    private static void outputComparisonResults(){
        System.out.println("Which numbers are equal? " + compareNumbers());
    }
    public static void main(String[] args) {
        enterNumbers();
        outputComparisonResults();
    }
}
