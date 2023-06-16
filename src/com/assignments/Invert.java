package com.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Invert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the row number of the Array");
        int row = input.nextInt();

        System.out.println("Enter the column number of the Array: ");
        int column = input.nextInt();

        int [][] arr2D = new int[row][column];
        System.out.println("Enter the elements of the 2D Array: ");
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                arr2D[i][j] = input.nextInt();
            }
        }

        System.out.println("The Matrix: ");
        for (int[] j: arr2D) {
            System.out.println(Arrays.toString(j));
        }

        System.out.println();

       // kth_Smallest(arr2D,row,column);
        System.out.println();

        invert(arr2D,row,column);

        System.out.println();

        image(arr2D,row,column);
    }

//    private static void kth_Smallest(int[][] arr2D,int row,int column) {
//        int size = (row*column)-1;
//        int[] arr = new int[size];
//    }

    public static void image(int[][] arr2D,int row, int column){
        int[][] image = new int[row][column];

        for (int i = 0; i < arr2D.length; i++) {
            int k = arr2D[i].length-1;
            for (int j = 0; j<arr2D[i].length ; j++) {
                image[i][k] = arr2D[i][j];
                k--;
            }
        }

        System.out.println("The Image Of the Matrix: ");
        for (int[] j: image) {
            System.out.println(Arrays.toString(j));
        }
    }

    public static void invert(int[][] arr2D,int row,int column){
        int[][] invert = new int[row][column];
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                if (arr2D[i][j] == 0){
                    invert[i][j]=1;
                }
                else if (arr2D[i][j] ==1 ){
                    invert[i][j]=0;
                }
            }
        }

        System.out.println("The Invert Of the Matrix: ");
        for (int[] j: invert) {
            System.out.println(Arrays.toString(j));
        }
    }
}
