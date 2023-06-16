package com.kunal;

import java.util.Arrays;
import java.util.Scanner;

public class Scope {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = 10;
        int b = 20;
        String name = "Kunal";

        {
             a = 100;//can not initialised outside the box
            int c = 99;//can not bw used outside the box
            System.out.println(a);
            name = "Rana";
            System.out.println(name);
        }

        int c = 75;

        System.out.println(a);
        System.out.println(name);

        fun(1,2,3,4,4,5,7);

        System.out.println(sum(2,4));
        System.out.println(sum(3,4,6));
        demo(1,3,5,6,3);
        demo("rahul","Kunal","rafi");

        System.out.println("Enter the value: ");
        int number = input.nextInt();

        System.out.println(isPrime(number));

        System.out.println("Enter a number");
        int armstrong = input.nextInt();
        isArmstrongNumber(armstrong);

        System.out.println("Enter a number to check whether it is Pallindrom or not: ");
        int pallindrom = input.nextInt();
        isPallindrom(pallindrom);

    }

    static void isPallindrom(int pallindrom) {
        int sum =0;
        int original = pallindrom;
        while (pallindrom!=0){
            int remainder = pallindrom%10;
            sum = (sum*10) + remainder;
            pallindrom= pallindrom/10;
        }

        if (sum == original){
            System.out.println("Pallindrom");
        }
        else {
            System.out.println("Not Pallindrom");
        }
    }

    static void isArmstrongNumber(int armstrong) {
        double sum = 0;
        int original = armstrong;
        while (armstrong!=0){
            int remainder = armstrong%10;
            sum = sum + Math.pow(remainder,3);
            armstrong= armstrong/10;
        }

        if (sum == original){
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not Armstrong Number");
        }
    }

    static boolean isPrime(int number) {
       if (number<=1){
           return false;
       }
       int count = 2;
       while (count*count <= number){
           if (number % count ==0){
               return false;
           }
           count++;
       }
       if (count*count > number){
           return true;
       }

       return false;


    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }


    //Two or more functions of same name have different parameter is called function overloading

    static int sum(int a ,int b){
        return a+b;
    }

    static int sum(int a ,int b,int c){
        return a+b+c;
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
