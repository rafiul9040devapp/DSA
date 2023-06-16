package com.assignments;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();

        getFactorial(num);
    }

    static void getFactorial(int num) {
        if (num ==0){
            System.out.println(num+ "! = 1");
        }
        else if (num == 1){
            System.out.println(num+"! = 1");
        }

        else {
            System.out.print("The Factorial of "+num+"! = ");
            int product =1;
            while (num!=0){
                product = product*num;
                if (num!=1){
                    System.out.print(num+" * ");
                }
                else {
                    System.out.print(num);
                }
                num--;
            }
            System.out.print(" = "+ product);
        }

    }
}
