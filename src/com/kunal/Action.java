package com.kunal;

import java.util.Arrays;
import java.util.Scanner;

public class Action {
    public static void main(String[] args) {
        //take input two numbers and print the sum
//        String message = greet();
//        System.out.println(message);

       Scanner input = new Scanner(System.in);

//       System.out.println("Enter the first number");
//       double num1 = input.nextDouble();
//       System.out.println("Enter the second number");
//       double num2 = input.nextDouble();
//       System.out.println("The sum of two numbers: "+ sum(num1,num2) );
//
//       sum();
        System.out.println("Enter your name: ");
        String name = input.next();

       String personalized = myGreeting(name);
        System.out.println(personalized);

        int[] arr = {1,2,3,4,55};
        change(arr);
        System.out.println(Arrays.toString(arr));


        // in coding dry means don't repeat yourself
    }

     static void change(int[] nums) {
        nums[0] = 99;
        //if you make any change in the object with the reference variable,then the main object will be changed
    }

    static String myGreeting(String name) {
        String message = "Hello "+ name;
        return message;
    }

//    static  void  sum(){
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter the first number");
//        int num1 = input.nextInt();
//        System.out.println("Enter the second number");
//        int num2 = input.nextInt();
//
//        int sum = num1+num2;
//        System.out.println("The sum of two numbers: "+ sum );
//
//    }

//    static double sum(double num1, double num2){
//        double result = num1+num2;
//        return result;
//    }

//    static String greet(){
//        String greeting = "How are you?";
//        return greeting;
//    }
}
