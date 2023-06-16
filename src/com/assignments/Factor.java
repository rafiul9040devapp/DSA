package com.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        getFactors(num);

        getFactors2(num);



        System.out.println("Enter the size of the Array: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the value of the Array: ");

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = input.nextInt();
        }

        for (int j :arr) {
            System.out.println(j);
        }

        System.out.println();

        int[] ans = new int[size];

        for (int i = 0; i <ans.length ; i++) {
            ans[i] = arr[arr[i]];
            System.out.print(ans[i]+" ");
        }

        System.out.println();

        int[] ans2 = new  int[2*size];

        for (int i = 0; i <arr.length ; i++) {
            ans2[i] = arr[i];
            ans2[i+size] = arr[i];
        }

        for (int j:ans2) {
            System.out.print(j+", ");
        }

        getRunningSum(arr);



    }

    static void getRunningSum(int[] arr) {
        int sum = 0;
        int [] ans = new int[arr.length];

        for (int i = 0; i <ans.length ; i++) {
            sum = sum + arr[i];
            ans[i] = sum;
        }

        for (int j: ans) {
            System.out.println(j+" ");
        }
    }

    static void getFactors(int num){
        for (int i =1; i <= num ; i++) {

            if (num % i == 0){
                System.out.println(i+ " ");
            }

        }
    }

    static void getFactors2(int num) {

        for (int i = 1; i <(num/2) ; i++) {
            if (num % i ==0){
                System.out.println(i+ " ");
            }
        }

        System.out.println(num);
    }
}
