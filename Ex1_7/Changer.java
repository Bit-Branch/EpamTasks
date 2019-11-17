package Ex1_7;

import java.util.Scanner;

public class Changer {
    private static int firstValue;
    private static int secondValue;

    private static void enterValues(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first value: ");
        firstValue = scanner.nextInt();
        System.out.println("Enter the second value: ");
        secondValue = scanner.nextInt();
    }

    private static void changeValues(){
        firstValue = firstValue ^ secondValue;
        secondValue = secondValue ^ firstValue;
        firstValue = firstValue ^ secondValue;
    }

    private static void outputResult(){
        System.out.println("Now the first value is: " + firstValue);
        System.out.println("Now the second value is: " + secondValue);
    }

    public static void main(String[] args) {
        enterValues();
        changeValues();
        outputResult();
    }
}
