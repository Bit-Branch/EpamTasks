package Ex2_2;

import java.util.Scanner;

public class Main {
    private static Dragon dragon = new Dragon();

    private static void enterDragonAge(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a count of years: ");
        int age = scanner.nextInt();
        dragon.setAge(age);
    }

    private static void outputCountOfHeads(){
        System.out.println("Dragon has " + dragon.getCountOfHeads() + " heads");
    }

    private static void outputCountOfEyes(){
        System.out.println("Dragon has " + dragon.getCountOfHeads()*2 + " eyes");
    }

    public static void main(String[] args) {
        enterDragonAge();
        dragon.growHeads();
        outputCountOfHeads();
        outputCountOfEyes();
    }
}
