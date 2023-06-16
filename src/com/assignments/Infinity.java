package com.assignments;

import java.util.Scanner;

public class Infinity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Numbers: ");

        int sum = 0;
        int max = 1;

        while (true){
            int num = input.nextInt();

            if (num!=0){
                sum+=num;
                max = Math.max(max,num);
            }

            else {
                break;
            }
        }

        System.out.println("The Summation of the Numbers: "+sum);
        System.out.println("The Highest Number:  "+max);

    }


}
