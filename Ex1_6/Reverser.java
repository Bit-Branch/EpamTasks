package Ex1_6;

import java.util.Scanner;

public class Reverser {
    private static int enteredNumber;
    private static int reversedNumber = 0;

    private static void enterNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a seven digit number:");
        enteredNumber = scanner.nextInt();
    }

    private static void reverseNumber(){
        while(enteredNumber != 0){
            reversedNumber = reversedNumber * 10;
            reversedNumber = reversedNumber + enteredNumber%10;
            enteredNumber = enteredNumber/10;
        }
    }

    private static void outputReversedNumber(){
        System.out.println("Reversed number: " + reversedNumber);
    }

    public static void main(String[] args) {
        enterNumber();
        reverseNumber();
        outputReversedNumber();
    }
}
