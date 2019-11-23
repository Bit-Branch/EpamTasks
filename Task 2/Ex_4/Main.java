package Ex_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static int leftBound;
    private static int rightBound;

    private static int sumOwnDividers(int number){
        int dividersSum = 0;
        for (int i = 1;i < (number/2)+1;i++){
            if (number % i == 0){
                dividersSum += i;
            }
        }
        return dividersSum;
    }

    private static void findFriendlyNumbers(){
        int firstSum;
        int secondSum;
        for (int i = leftBound;i < rightBound;i++){
            firstSum = sumOwnDividers(i);
            secondSum = sumOwnDividers(firstSum);
            if (i == secondSum && i < firstSum){
                System.out.println(i + " - " + firstSum);
            }
        }
    }

    private static void enterBounds(){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Left bound:");
            leftBound = scanner.nextInt();
            System.out.println("Right bound:");
            rightBound = scanner.nextInt();
        }catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
            enterBounds();
            findFriendlyNumbers();
    }
}
