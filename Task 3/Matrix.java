package com.company;

import java.text.DecimalFormat;

public class Matrix {
    private int rows;
    private int columns;
    private double[][] matrix;

    public Matrix() {
        rows = 1;
        columns = 1;
        matrix = new double[rows][columns];
    }

    public Matrix(int rows, int columns) throws InvalidSizeException {
        if(rows <= 0 || columns <= 0) {
            throw new InvalidSizeException("Invalid matrix dimensions specified");
        }
        this.rows = rows;
        this.columns = columns;
        this.matrix = new double[rows][columns];
    }

    public Matrix(int size) throws InvalidSizeException {
        if(size <= 0) {
            throw new InvalidSizeException("Invalid matrix dimensions specified");
        }
        rows = size;
        columns = size;
        matrix = new double[size][size];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(double[][] matrix) {
        this.matrix = matrix;
    }

    public final void print() {
        DecimalFormat myFormatter = new DecimalFormat("###.##");
        String formattedElement;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                formattedElement = myFormatter.format(matrix[i][j]);
                System.out.print(formattedElement + " ");
            }
            System.out.println();
        }
    }

    public double getMaxElement(){
        double maxElement = matrix[0][0];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                if (matrix[i][j] > maxElement){
                    maxElement = matrix[i][j];
                }
            }
        }
        return maxElement;
    }

    public double getMinElement(){
        double minElement = matrix[0][0];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                if (matrix[i][j] < minElement){
                    minElement = matrix[i][j];
                }
            }
        }
        return minElement;
    }
}