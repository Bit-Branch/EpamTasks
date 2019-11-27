package com.company;

import java.util.Random;

public class Task {

    public static void initializeMatrix(Matrix matrix, double leftBound, double rightBound){
        double[][] array = matrix.getMatrix();
        double diff = rightBound - leftBound;
        Random random = new Random();
        for (int i = 0; i<matrix.getRows();i++){
            for (int j=0;j<matrix.getColumns();j++){
                array[i][j] = leftBound + (random.nextDouble() * diff);
            }
        }
        matrix.setMatrix(array);
    }

    private static double multiplyAllElements(Matrix matrix){
        double composition = 1;
        double[][] array = matrix.getMatrix();
        for (int i = 0; i<array.length;i++){
            for (double element : array[i]
            ) {
                composition *= element;
            }
        }
        return composition;
    }

    private static double addUpAllElements(Matrix matrix){
        double sum = 0;
        double[][] array = matrix.getMatrix();
        for (int i = 0; i<array.length;i++){
            for (double element : array[i]
            ) {
                sum += element;
            }
        }
        return sum;
    }

    public static double calculateGeometricMean(Matrix matrix){
        return Math.pow(multiplyAllElements(matrix),
                1.0/(matrix.getColumns()*matrix.getRows()));
    }

    public static double calculateArithmeticMean(Matrix matrix){
        return addUpAllElements(matrix)/(matrix.getColumns()*matrix.getRows());
    }

    public static int findFirstLocalMinimum(Matrix matrix){
        double [][] array = matrix.getMatrix();
        for (int i = 0;i< matrix.getRows(); i++){
            for (int j = 1; j< matrix.getColumns()-1;j++){
                if(array[i][j] < array[i][j-1] && array[i][j] < array[i][j+1]){
                    return (j + i * matrix.getColumns());
                }
            }
        }
        return -1;
    }

    public static int findFirstLocalMaximum(Matrix matrix){
        double [][] array = matrix.getMatrix();
        for (int i = 0;i< matrix.getRows(); i++){
            for (int j = 1; j< matrix.getColumns()-1;j++){
                if(array[i][j] > array[i][j-1] && array[i][j] > array[i][j+1]){
                    return (j + i * matrix.getColumns());
                }
            }
        }
        return -1;
    }

    public static void transpose(Matrix matrix) {
        double[][] newMatrix = new double[matrix.getColumns()][matrix.getRows()];
        matrix.setRows(matrix.getMatrix()[0].length);
        matrix.setColumns(matrix.getMatrix().length);

        for (int i = 0; i < matrix.getMatrix().length; i++) {
            for (int j = 0; j < matrix.getMatrix()[i].length; j++) {
                newMatrix[j][i] = matrix.getMatrix()[i][j];
            }
        }
        matrix.setMatrix(newMatrix);
    }
}
