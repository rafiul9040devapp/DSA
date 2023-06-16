package com.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class OddCells {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the row number: ");
        int m = input.nextInt();

        System.out.println("Enter the column number: ");
        int n = input.nextInt();

        int [][] arr2D = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr2D[i][j] = 0 ;
            }
        }

        System.out.println("The Matrix: ");
        for (int[] j: arr2D) {
            System.out.println(Arrays.toString(j));
        }


        int[][] indices = new int[2][2];

        System.out.println("Enter the Values of the Indices Matrix: ");
        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < indices[i].length; j++) {
                indices[i][j] = input.nextInt();
            }
        }

        for (int[] j: indices) {
            System.out.println(Arrays.toString(j));
        }

        getOddValues(arr2D,indices,m,n);
    }

    static void getOddValues(int[][] arr2D, int[][] indices ,int m , int n) {

        for (int i = 0; i < indices.length; i++) {
            int row = indices[i][0];
            int col = indices[i][1];

            for (int j = 0; j <n ; j++) {
                arr2D[row][j]++;
            }

            for (int j = 0; j < m; j++) {
                arr2D[j][col]++;
            }
        }

        System.out.println("Matrix After The Increment: ");
        for (int[] j: arr2D) {
            System.out.println(Arrays.toString(j));
        }

        System.out.println();
        int count = 0 ;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr2D[i][j] %2 !=0){
                    count++;
                }
            }
        }
        System.out.println("Total Odd Number: "+count);
    }
}
