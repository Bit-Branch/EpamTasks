package Ex2_1;

public class Sheet {
    private static Point pointA = new Point();
    private static Point pointB = new Point();
    private static Point pointC = new Point();

    private static double distance(Point a, Point b){
        double length = Math.sqrt(Math.pow(a.getX() - b.getX(),2) +
                Math.pow(a.getY() - b.getY(),2));
        return length;
    }

    private static boolean areTheVertices(Point a, Point b, Point c){
        boolean firstInequality =  distance(a, b) + distance(c, b) <= distance(a, c);
        boolean secondInequality =  distance(a, b) + distance(a, c) <= distance(c, b);
        boolean thirdInequality =  distance(c, b) + distance(c, a) <= distance(a, b);
        if (firstInequality || secondInequality || thirdInequality){
            return false;
        }
        return true;
    }

    private static boolean isEqualityCorrect(double lengthA, double lengthB, double lengthC){
        if(Math.sqrt(Math.pow(lengthA, 2) + Math.pow(lengthB, 2)) == lengthC)
            return true;
        return false;
    }

    private static boolean isTriangleRectangular(Point a, Point b, Point c){
        if (areTheVertices(a, b, c)){
            if (isEqualityCorrect(distance(c, b), distance(c, a), distance(a, b))
                    || isEqualityCorrect(distance(a, b), distance(a, c), distance(c, b))
                    || isEqualityCorrect(distance(a, b), distance(c, b), distance(a, c))){
                return true;
            }
        }
        return false;
    }

    private static void inputPoints(){
        pointA.enterCoordinates();
        pointB.enterCoordinates();
        pointC.enterCoordinates();
    }

    private static void outputResults(){
        System.out.println("Are the vertices of triangle? "
                    + areTheVertices(pointA,pointB,pointC));
        System.out.println("Is the triangle rectangular? "
                    + isTriangleRectangular(pointA,pointB,pointC));
    }

    public static void main(String[] args) {
        inputPoints();
        outputResults();
    }
}
