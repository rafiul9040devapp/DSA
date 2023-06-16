package com.kunal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Syntax
//        int[] rnos = new int[5];
        int[] rnos2  ={12,18,34,53,54};

        System.out.println("Enter the roll numbers: ");
//
//        for (int i = 0; i < rnos.length; i++) {
//            rnos[i] = input.nextInt();
//        }

//        for (int i = 0; i < rnos.length; i++) {
//            System.out.print(rnos[i]+" ");
//        }

//        for (int j: rnos) { // j represents every elements of the array
//            System.out.print(j+" ");
//        }

        System.out.println(Arrays.toString(rnos2));

        for (int num: rnos2) {
            System.out.print(num+" ");
        }

//        String[] str = new String[4];
//
//        for (int i = 0; i < str.length; i++) {
//            str[i] = input.next();
//        }
//
//        System.out.println(Arrays.toString(str));

        //MULTI-DIMENSIONAL ARRAYS

        //int[][] matrix = new int[3][];

//        int[][] matrix = {
//                {1,2,3},    //colome number for individual row doesn't matter
//                {4,5},
//                {6,7,8,9}
//        };

//        int[][] arr = new int[3][3];
//        System.out.println(arr.length);
//
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                arr[row][col] = input.nextInt();
//            }
//        }

//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print( arr[row][col]+" ");
//            }
//            System.out.println();
//        }

//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }
//
//        for (int[] a : arr) {
//            System.out.println(Arrays.toString(a));
//        }

        //Column not fixed size

        int[][] arr2D = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };

        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                System.out.print(arr2D[row][col]+" ");
            }
            System.out.println();
        }

        for (int row = 0; row < arr2D.length ; row++) {
            System.out.println(Arrays.toString(arr2D[row]));
        }

        for (int[] a: arr2D) {
            System.out.println(Arrays.toString(a));
        }

        //ArrayList

        ArrayList<Integer> list = new ArrayList<>();

        list.add(58);
        list.add(158);
        list.add(258);
        list.add(458);
        list.add(558);

        System.out.println(list);
        System.out.println(list.contains(458));

        list.set(0,99);
        list.remove(3);

        System.out.println(list);

        ArrayList<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list1.add(input.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(list1.get(i));
        }

        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();

        //Initialisation of inner Arraylist
        for (int i = 0; i < 3; i++) {
            list2.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                list2.get(i).add(input.nextInt());
            }
        }

        System.out.println(list2);


    }
}
