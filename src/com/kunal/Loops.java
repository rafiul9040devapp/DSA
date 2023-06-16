package com.kunal;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max =  Math.max(c , Math.max(a,b));
        System.out.println(max);

        int min = Math.min(c,Math.min(a,b));
        System.out.println(min);

//        int max  = a ;
//
//        if (b>max){
//             max = b;
//        }
//        if (c> max){
//             max = c;
//        }
//
//        System.out.println(max);
//
//        int min = a ;
//
//        if (b < min){
//            min = b;
//        }
//        if (c < min){
//            min = c;
//        }
//
//        System.out.println(min);


       // for( int i =1; i<=5;i++){
         //   System.out.println(i);
        //}

//        Scanner input = new Scanner(System.in);
//
//        int n = input.nextInt();
//
//        for (int num = 0; num <= n  ; num++) {
//            System.out.print(num + " " );
//        }

       // int p = 1;

//        while (p<=5){
//            System.out.println(p);
//            p++;
//        }

//        do{
//            System.out.println(p);
//            p++;
//        } while (p<=5);

    }
}
