package com.assignments;

import java.util.Scanner;

public class Candy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of Kids: ");
        int size = input.nextInt();

        System.out.println("Enter the Candies for each Kid: ");
        int[] candy = new  int[size];

        for (int i = 0; i <candy.length ; i++) {
            candy[i] = input.nextInt();
        }

        System.out.println("Candies of Kids: ");
        for (int j:
             candy) {
            System.out.println(j+" ");
        }

        System.out.println("Enter extra Candies For kids: ");
        int extraCandies = input.nextInt();

        getMaxCandies(candy,extraCandies);
    }

     static void getMaxCandies(int[] candy, int extraCandies) {
        int max = 0;

         for (int i = 0; i < candy.length; i++) {
             max = Math.max(candy[i],max);
         }
         System.out.println("Maximum Candy: "+ max);

         boolean[] result = new boolean[candy.length];

         for (int i = 0; i < candy.length; i++) {
             if (candy[i]+extraCandies > max){
                 result[i] = true;
             }
             else {
                 result[i] = false;
             }
         }

         for (boolean j:
              result) {
             System.out.println(j+" ");
         }


    }
}
