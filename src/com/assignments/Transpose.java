package com.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the 2D Array: ");
        int size = input.nextInt();

        int[][] arr2D = new int[size][size];
        System.out.println("Enter the Values Of the 2D Array: ");
        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                arr2D[row][col] = input.nextInt();
            }
        }
        System.out.println();

        for (int[] j:
             arr2D) {
            System.out.println(Arrays.toString(j));
        }

        int[][] trans = new int[size][size];

        for (int col = 0; col < arr2D.length; col++) {
            for (int row = 0; row < arr2D[col].length; row++) {
                trans[row][col] = arr2D[col][row];
            }
        }

        System.out.println("The Transpose of the 2D Matrix: ");

        for (int[] j:
             trans) {
            System.out.println(Arrays.toString(j));
        }

    }
}
