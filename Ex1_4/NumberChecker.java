package Ex1_4;

import java.util.Scanner;

public class NumberChecker {
    private static String enteredNumber;
    private static int numberConstituents[] = new int[4];

    private static void enterNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a fourth digit number:");
        enteredNumber = scanner.nextLine();
    }

    private static void decomposeNumber(){
        for (int i = 0; i<numberConstituents.length; i++)
            numberConstituents[i] = Character.getNumericValue(enteredNumber.charAt(i));
    }

    private static boolean isSequenceSorted(){
        int n = 0;
        for (int i = 0; i < numberConstituents.length - 1 ;i++){
            if (numberConstituents[i] > numberConstituents[i+1]) n--;
            if (numberConstituents[i] < numberConstituents[i+1]) n++;
        }
        if(n == numberConstituents.length-1 || n== numberConstituents.length*(-1)+1)
            return true;
        return false;
    }

    private static void outputResult(){
        System.out.println("Does the entered number form an sequence? "
                    + isSequenceSorted());
    }

    public static void main(String[] args) {
        enterNumber();
        decomposeNumber();
        outputResult();
    }
}
