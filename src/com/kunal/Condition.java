package com.kunal;

import java.util.Scanner;

public class Condition {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

//        int w = input.nextInt();
//
//        int sum =0;
//        int product =1;
//
//        while (w!=0){
//            int remainder = w%10;
//
//            sum+=remainder;
//            product*=remainder;
//
//            w/=10;
//        }
//
//        int result = product - sum;
//        System.out.println(result);

//        char ch = input.next().trim().charAt(0);
//
//        if (ch>= 'a' && ch<= 'z'){
//            System.out.println("Lowercase");
//        }else {
//            System.out.println("Uppercase");
//        }

       // Fibonnachi number
        int n = input.nextInt();
        int p = 0;
        int sum = 1;
        int count = 2;
        while (count<= n){
            int temp = sum;
            sum+=p;
            p = temp;
            count++;
        }

        System.out.println(sum);

//
//        int q = input.nextInt();
//        int sum = 0;
//
//        while (q>0){
//            int remainder = q%10;
//            sum = (sum*10) + remainder;
//            q = q/10;
//        }
//        System.out.println(sum);










//        int salary = 24500;
//
//        if(salary>=10000){
//            salary = salary + 2000;
//        } else if(salary >= 20000){
//            salary+=3000;
//        } else {
//            salary = salary+ 1000;
//        }
//
//        System.out.println(salary);
    }
}
