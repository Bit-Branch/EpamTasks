package com.company;

public class Main {

    private static void outputAllCalculations(Matrix matrix){
        System.out.println("Original matrix:");
        matrix.print();
        System.out.println("Arithmetic mean: "
                + Task.calculateArithmeticMean(matrix));
        System.out.println("Geometric mean: "
                + Task.calculateGeometricMean(matrix));
        System.out.println("First local minimum: "
                + Task.findFirstLocalMinimum(matrix));
        System.out.println("First local maximum: "
                + Task.findFirstLocalMaximum(matrix));
        System.out.println("Max element: " + matrix.getMaxElement());
        System.out.println("Min element: " + matrix.getMinElement());
        Task.transpose(matrix);
        System.out.println("Transposed matrix: ");
        matrix.print();
    }

    public static void main(String[] args) {
        try {
            Matrix matrix = new Matrix(4,3);
            Task.initializeMatrix(matrix,2.5,3.83);
            outputAllCalculations(matrix);
        } catch (InvalidSizeException e) {
            e.printStackTrace();
        }
    }
}
