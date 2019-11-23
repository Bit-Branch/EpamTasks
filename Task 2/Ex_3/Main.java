package Ex_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static int naturalNumber;

    private static boolean isPerfectNumber(int number){
        int dividersSum = 0;
        for (int i = 1;i < (number/2)+1;i++){
            if (number % i == 0){
                dividersSum += i;
            }
        }
        return dividersSum == number;
    }

    private static void enterNaturalNumber() throws InputMismatchException,
            NotNaturalNumberException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter natural number:");
        naturalNumber = scanner.nextInt();
        if (naturalNumber < 0) {
            throw new NotNaturalNumberException("The entered number is not natural");
        }
    }

    public static void main(String[] args) {
        try {
            enterNaturalNumber();
            System.out.println(isPerfectNumber(naturalNumber));
        }catch(InputMismatchException e){
            System.out.println(e.getMessage());
        }catch (NotNaturalNumberException e){
            System.out.println(e.getMessage());
        }
    }
}
