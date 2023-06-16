package com.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Wealth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the Array: ");
        int size = input.nextInt();

        int[][] arr2D = new  int[size][size];

        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                arr2D[row][col] = input.nextInt();
            }
        }

        for (int[] j: arr2D) {
            System.out.println(Arrays.toString(j));
        }

//        int[] wealth = new int[arr2D.length];
//
//
//        for (int row = 0; row < arr2D.length; row++) {
//            int sum = 0;
//            for (int col = 0; col < arr2D[row].length; col++) {
//                sum = sum + arr2D[row][col];
//            }
//            wealth[row] = sum;
//        }
//
//        for (int j :wealth) {
//            System.out.println(j+" ");
//        }
//
////        int max = Arrays.stream(wealth).max().getAsInt();
////        System.out.println("Largest in given array is " +max);
//
//        int max = wealth[0];
//        for (int i = 1; i < wealth.length ; i++) {
//            if (wealth[i]>max){
//                max = wealth[i];
//            }
//        }
//
//        System.out.println("Richest person : "+ max);

        getMaximumWealth(arr2D);
    }

    static void getMaximumWealth(int[][] arr2D) {
        int max =0;

        for (int row = 0; row < arr2D.length; row++) {
            int sum = 0;
            for (int col = 0; col < arr2D[row].length; col++) {
                sum = sum + arr2D[row][col];
            }
            max = Math.max(max,sum);
        }

        System.out.println(max);
    }
}
