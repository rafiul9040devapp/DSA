package com.assignments;

import java.util.Scanner;

import static com.assignments.Factorial.getFactorial;

public class Voter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.println("Enter Your Age: ");
//        int age = input.nextInt();
//
//        getEligible(age);
//
//        System.out.println("Enter The First Number: ");
//        int num1 = input.nextInt();
//
//        System.out.println("Enter The Second Number: ");
//        int num2 = input.nextInt();
//
//        getSum(num1,num2);
//        getProduct(num1,num2);
//
//        System.out.println("Enter The Radius Of The Circle: ");
//        double radius = input.nextDouble();
//        getCircleValue(radius);
//
//        System.out.println("Enter A number ot check whether it is PRIME or Not: ");
//        int prime = input.nextInt();
//        getPrime(prime);
//
//        System.out.println("Enter a number ot get factorial: ");
//        int factorial = input.nextInt();
//        getFactorial(factorial);
//        System.out.println();

//        System.out.println("Enter a number ot check whether it is Palindrome or Not: ");
//        int palindrome = input.nextInt();
//        getPalindrome(palindrome);
//
//        System.out.println("Enter the THREE Triangle Sides In order to find out PYTHAGOREAN TRIPLET: ");
//        int side1 =input.nextInt();
//        int side2 = input.nextInt();
//        int side3 = input.nextInt();
//
//        getPythagorean(side1,side2,side3);

//        System.out.println("Enter the Start point and the End point of the range: ");
//        int start = input.nextInt();
//        int end = input.nextInt();
//
//        for (int i = start; i <=end ; i++) {
//            if (getPrime2(i)){
//                System.out.print(i+" ");
//            }
//        }
        System.out.println("Enter the Amount of Natural Number: ");
        int natural = input.nextInt();
        getNaturalNumber(natural);

    }

    static void getNaturalNumber(int natural) {
        int sum = 0;
        for (int i = 1; i <=natural ; i++) {
            sum+=i;
        }
        System.out.println("The sum of Natural Number: "+ sum);
    }

    static boolean getPrime2(int i) {

        if (i==1 || i==0 ) {
            return false;
        }

        if (i==2){
            return true;
        }

        int count = 2;
        while (count*count<=i){
            if (i%count ==0 ){
                return false;
            }
            count++;
        }

        if (count*count >i){
            return true;
        }

        return false;
    }

    static void getPythagorean(int side1, int side2, int side3) {

        if (    Math.pow(side3,2)==Math.pow(side1,2)+ Math.pow(side2,2) ||
                Math.pow(side2,2)==Math.pow(side1,2)+ Math.pow(side3,2)||
                Math.pow(side1,2)==Math.pow(side2,2)+ Math.pow(side3,2)
           ){
            System.out.println("PYTHAGOREAN TRIPLET ");
        }

        else {
            System.out.println("NOT PYTHAGOREAN TRIPLET ");
        }
    }

    static void getPalindrome(int palindrome) {
        int original = palindrome;
        int sum = 0;

        while (palindrome!=0){
            int remainder = palindrome%10;
            sum = sum*10 + remainder;
            palindrome = palindrome/10;
        }

        if (original == sum){
            System.out.println("Palindromic Number");
        }

        else {
            System.out.println("Not Palindromic Number");
        }
    }

    static void getPrime(int prime) {

        if (prime==1||prime==0){
            System.out.println("Not Prime");
        }

        else if (prime ==2){
            System.out.println("Prime");
        }

        int count= 2;
        while (count*count <= prime){
            if (prime%count ==0){
                System.out.println("Not Prime");
                break;
            }
            count++;
        }

         if (count*count>prime && prime!=0 && prime!=1){
            System.out.println("Prime");
        }
    }

    static void getCircleValue(double radius) {
        double circumference = 2 * Math.PI * radius;
        System.out.println("The Circumference Of the Circle: "+ circumference);
        double area = Math.PI * Math.pow(radius,2);
        System.out.println("The Area Of The Circle: "+ area);
    }

    static void getProduct(int num1, int num2) {
        int result = num1*num2;
        System.out.println("The Product Of The Numbers: "+ result);
    }

    static void getSum(int num1, int num2) {
        int result = num1+ num2;
        System.out.println("Sum Of The Number: "+ result);
    }

    static void getEligible(int age) {
        if (age>= 18){
            System.out.println("You are Eligible for Vote");
        }
        else {
            System.out.println("You are NOT Eligible for Vote");
        }
    }
}
