package com.assignments;
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the First number: ");
        int num1 = input.nextInt();
        getOddEven(num1);

        System.out.println("Enter the Second number: ");
        int num2 = input.nextInt();
        getOddEven(num2);

        System.out.println("Enter the Third number: ");
        int num3 = input.nextInt();
        getOddEven(num3);

        getMax1(num1,num2,num3);
        getMax2(num1,num2,num3);

        getMin1(num1,num2,num3);
        getMin2(num1,num2,num3);
    }

    static void getOddEven(int num1) {
        if (num1 % 2 == 0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }

    static void getMin2(int num1, int num2, int num3) {
        int min = Math.min(num1,Math.min(num2,num3));
        System.out.println(min);
    }

    static void getMin1(int num1, int num2, int num3) {
        int min = num1;

        if (num2<min){
            min = num2;
        }
        if (num3<min){
            min = num3;
        }

        System.out.println(min);
    }

    static void getMax2(int num1, int num2, int num3) {

        int max = Math.max(num1,Math.max(num2,num3));
        System.out.println(max);
    }

    static void getMax1(int num1, int num2, int num3) {
        int max = num1;

        if (num2>max){
            max = num2;
        }
        if (num3>max){
            max =num3;
        }

        System.out.println(max);
    }
}
