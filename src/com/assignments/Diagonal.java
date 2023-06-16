package com.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Diagonal {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter the size of the Matrix: ");
        int size = input.nextInt();

        int[][] matrix = new int[size][size];

        System.out.println("Enter the values of the Matrix: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = input.nextInt();
            }
        }

        System.out.println("The Matrix: ");
        for (int[] j: matrix) {
            System.out.println(Arrays.toString(j));
        }

        System.out.println("The Diagonal Sum Of the "+size+"*"+size+" Matrix: "+getDiagonalSum(matrix));


    }

    static int getDiagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i]+matrix[i][matrix.length-i-1];//The Main Logic
        }
        if (matrix.length%2 !=0 ) {
            int mid = matrix[matrix.length/2][matrix.length/2];
            return sum-mid;
        }

        return sum;
    }
}
