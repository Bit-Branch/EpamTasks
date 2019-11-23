package Ex_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static int naturalNumberOne;
    private static int naturalNumberTwo;

    public static int calculateHighestDigit(int naturalNumber){
        int highestDigit = 0;
        int currentDigit;

        while(naturalNumber > 0 && highestDigit != 9){
            if((currentDigit = naturalNumber % 10) > highestDigit){
                highestDigit = currentDigit;
            }
            naturalNumber /= 10;
        }
        return highestDigit;
    }

    //Euclidean algorithm
    public static int calculateGCD(int firstNumber, int secondNumber){
        if (secondNumber == 0){
            return firstNumber;
        }
        return calculateGCD(secondNumber, firstNumber % secondNumber);
    }

    public static int calculateLCM(int firstNumber, int secondNumber){
        return (firstNumber / calculateGCD(firstNumber,secondNumber) * secondNumber);
    }

    public static int countUniqueDigits(int number){
        int uniqueDigits=0;
        int numberTemp;
        for(int i=0;i<10;++i) {
            numberTemp = number;
            while(numberTemp > 0) {
                if(numberTemp % 10 == i) {
                    ++uniqueDigits;
                    break;
                }
                numberTemp /= 10;
            }
        }
        return uniqueDigits;
    }

    public static boolean isPalindrome(int naturalNumber){
        int numberCopy = naturalNumber;
        int mirroredNumber = 0;
        while(numberCopy != 0){
            mirroredNumber *= 10;
            mirroredNumber += numberCopy % 10;
            numberCopy /= 10;
        }
        return (naturalNumber == mirroredNumber);
    }

    public static boolean isPrime(int naturalNumber){
        for (int i = 2; i<(naturalNumber^(1/2)); i++){
            if (naturalNumber % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void findPrimeDivisors(int naturalNumber){
        for (int i = 2; i < (naturalNumber^(1/2)); ){
            if (naturalNumber % i == 0){
                System.out.print(i + " ");
                naturalNumber /= i;
            }
            else{
                ++i;
            }
        }
        if ( naturalNumber > 1 ) {
            System.out.println(naturalNumber + " ");
        }
        System.out.println();
    }

    public static void enterNaturalNumbers() throws InputMismatchException,
            NotNaturalNumberException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First natural number:");
        naturalNumberOne = scanner.nextInt();
        System.out.println("Second natural number:");
        naturalNumberTwo = scanner.nextInt();
        if (naturalNumberOne < 0 || naturalNumberTwo < 0){
            throw new NotNaturalNumberException("One of the entered numbers is not natural");
        }
    }

    public static void outputAllCalculations(){
        System.out.println("Highest digit in first natural number: "
                + calculateHighestDigit(naturalNumberOne));
        System.out.println("Is the first natural number a palindrome? "
                + isPalindrome(naturalNumberOne));
        System.out.println("Is the first natural number a prime number?"
                + isPrime(naturalNumberOne));
        System.out.print("All prime divisors of the first natural number: ");
        findPrimeDivisors(naturalNumberOne);
        System.out.println("GCD: " + calculateGCD(naturalNumberOne,naturalNumberTwo));
        System.out.println("LCM: " + calculateLCM(naturalNumberOne,naturalNumberTwo));
        System.out.println("Count of different digits of the first natural number "
                + countUniqueDigits(naturalNumberOne));
    }

    public static void main(String[] args) {
        try {
            enterNaturalNumbers();
            outputAllCalculations();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
