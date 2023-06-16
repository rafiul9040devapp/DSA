package com.assignments;

import java.util.Scanner;

public class GoodPair {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the Array: ");
        int size = input.nextInt();

        System.out.println("Enter the elements of the Array: ");
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println();

        for (int j: arr) {
            System.out.print(j+" ");
        }
        System.out.println();

        getPairs(arr);

        System.out.println("Enter the elements of the Array2: ");
        int[] arr2 = new int[size];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = input.nextInt();
        }

        getSmaller(arr2);


    }

    static void getPairs(int[] arr) {
        int count = 0;
        System.out.println("Good Pairs: ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length ; j++) {
                if (i<j && arr[i]==arr[j]){
                    count++;
                    System.out.println("("+i+","+j+")");
                }
            }
        }

        System.out.println("Total Good Pairs: "+count);
    }

    static void getSmaller(int[] arr2) {
        int[] result = new int[arr2.length];


        for (int i = 0; i < arr2.length; i++) {
            int count = 0;
            for (int j = 0; j < arr2.length; j++) {
                if (j!=i && arr2[i]>arr2[j]){
                    count++;
                }
            }
            result[i] = count;
        }

        for (int j:
             result) {
            System.out.print(j+" ");
        }
    }
}
