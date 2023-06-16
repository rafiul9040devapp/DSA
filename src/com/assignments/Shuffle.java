package com.assignments;

import java.util.Scanner;

public class Shuffle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the Array: ");
        int size = input.nextInt();

        int[] arr = new  int[size];
        System.out.println("Enter the Elements of the Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("The Array: ");

        for (int j : arr) {
            System.out.print(j+ " ");
        }

        System.out.println();
        System.out.println("The Reverse Of The Array: ");

        int[] arrRev = new  int[size];
        int k = arrRev.length;

        for (int i =0; i < arrRev.length  ; i++) {
            arrRev[k-1] = arr[i];
            k--;
        }

        for (int j:
             arrRev) {
            System.out.print(j+" ");
        }

        System.out.println();
        System.out.println("The First Half Of the Array: ");

        int[] arr1 = new int[size/2];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }

        for (int j :
             arr1) {
            System.out.print(j+" ");
        }

        System.out.println();
        System.out.println("The Second Half Of The Array: ");

        int[] arr2 = new int[size/2];
        for (int i =0 ; i <arr2.length; i++) {
            arr2[i] = arrRev[i];
        }

        for (int j:arr2) {
            System.out.print(j+" ");
        }

        System.out.println();
        System.out.println("The Shuffle of the Array: ");

        int[] arrShuffle = new int[size];

        for (int i = 0; i < arrShuffle.length; i++) {

            if (i==0 || i%2==0){
                int j =0;
                arrShuffle[i] =arr1[j];
                arrShuffle[i+1] = arr2[j];
                j++;
            }
        }
        for (int j:
             arrShuffle) {
            System.out.print(j+" ");
        }
    }
}
