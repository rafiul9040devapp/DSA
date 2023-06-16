package com.assignments;

import java.util.Scanner;

public class EvenDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter The Size Of the array: ");
        int size = input.nextInt();

        System.out.println("Enter the values of the Array: ");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        for (int j :
             arr) {
            System.out.print(j+" ");
        }

        System.out.println();

        int result = 0 ;
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            if ( count(value) %2 ==0 ){
                result++;
            }
        }

        System.out.println("Number with even digits in the array : "+ result);
    }

    private static int count(int value) {
        int digits= 0;
        while (value!=0){
            value =value/10;
            digits++;
        }
        return digits;
    }
}
