package Ex1_3;

import java.util.Scanner;

public class AreaCalculator {
    private static double outerRadius;
    private static double innerRadius;

    private static void enterRadii(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter outer radius:");
        outerRadius = scanner.nextDouble();
        System.out.println("Enter inner radius:");
        innerRadius = scanner.nextDouble();
    }

    private static double calculateArea(){
        double area = outerRadius*outerRadius*Math.PI - innerRadius*innerRadius*Math.PI;
        return area;
    }

    private static void outputCalculatedArea(){
        System.out.println(calculateArea());
    }

    public static void main(String[] args) {
        enterRadii();
        outputCalculatedArea();
    }
}
