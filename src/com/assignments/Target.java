package com.assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Target {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the Array: ");
        int size = input.nextInt();

        System.out.println("Enter the number Array: ");
        int[] nums = new int[size];
        for (int i = 0; i <nums.length ; i++) {
            nums[i] = input.nextInt();
        }
        System.out.println();

        for (int j : nums) {
            System.out.print(j+" ");
        }
        System.out.println();

        System.out.println("Enter the index Array: ");
        int[] index = new int[size];
        for (int i = 0; i < index.length; i++) {
            index[i] = input.nextInt();
        }
        System.out.println();

        for (int j: index) {
            System.out.print(j+" ");
        }
        System.out.println();

        getTargetArr(nums,index);
        System.out.println();

        System.out.println("Enter a Sentence");
        String sentence = input.next();
        getPangram(sentence);
        if (getPangram(sentence) == true){
            System.out.println("The sentence is Pangram");
        }
        else {
            System.out.println("The sentence is Not Pangram");
        }
    }

    static void getTargetArr(int[] nums, int[] index) {
         ArrayList<Integer> list = new ArrayList<>();

         for (int i = 0; i < nums.length; i++) {
             list.add(index[i],nums[i]);
         }

         for (int i = 0; i < nums.length; i++) {
             System.out.print(list.get(i)+" ");
         }
    }

    static boolean getPangram(String sentence) {
        char[] c = sentence.toCharArray();

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                if (i<j && c[i] == c[j]){
                  return false;
                }
            }
        }
        return true;
    }
}
