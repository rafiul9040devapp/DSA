package com.assignments;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a= 0;
        int sum = 1;
        System.out.println("Enter the Nth number: ");
        int value = input.nextInt();
        int count = 2;
        while (count<value){
            int temp = sum;
            sum+=a;
            a = temp;
            count++;
        }
        System.out.println(sum);
    }
}
