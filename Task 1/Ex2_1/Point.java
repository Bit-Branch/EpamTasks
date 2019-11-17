package Ex2_1;

import java.util.Scanner;

public class Point {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void enterCoordinates(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coordinates of the point");
        System.out.println("Enter x: ");
        this.x = scanner.nextInt();
        System.out.println("Enter y: ");
        this.y = scanner.nextInt();
    }
}
