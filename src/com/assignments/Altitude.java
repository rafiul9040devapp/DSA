package com.assignments;

import java.util.Scanner;

public class Altitude {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the Array: ");
        int size = input.nextInt();


        int[] gain = new int[size];
        System.out.println("Enter the elements of the gain: ");
        for (int i = 0; i < gain.length; i++) {
            gain[i] = input.nextInt();
        }

        System.out.println();
        for (int j: gain) {
            System.out.print(j+" ");
        }
        System.out.println();

        int[] altitude = new int[size+1];
        for (int i = 0; i < altitude.length; i++) {
            if (i==0){
                altitude[i] = 0;
            }
            else {
                altitude[i] = altitude[i-1] + gain[i-1];
            }
        }


        System.out.println();
        for (int j: altitude) {
            System.out.print(j+" ");
        }
        System.out.println();

        int max = 0;
        for (int j : altitude) {
            max = Math.max(max, j);
        }

        System.out.println("The Highest Altitude: "+ max);

        input.close();
    }
}
