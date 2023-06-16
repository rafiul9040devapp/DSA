package com.assignments;

import java.util.Scanner;

public class ArrForm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of the K ");
        int k = input.nextInt();

        System.out.println("Enter the size of the Array : ");
        int size =  input.nextInt();

        int[] num = new int[size];
        System.out.println("Enter the elements of the Array: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextInt();
        }

        System.out.println("The Num Array: ");

        for (int j:
             num) {
            System.out.print(j+" ");
        }

        System.out.println();

        getNumber(num,k);

//        System.out.println("Enter An Integer Number: ");
//        int num = input.nextInt();
//
//        int count = 0;
//        int reverse = 0;
//        while (num!=0){
//            int remainder = num%10;
//            reverse = (reverse*10)+remainder;
//            num = num/10;
//            count++;
//        }
//
//        System.out.println(count);
//        System.out.println(reverse);

//        array_form();
    }

    static void getNumber(int[] num, int k) {
        int sum = 0 ;

        for (int i = 0; i < num.length; i++) {
            sum = (sum*10) + num[i];
        }

        sum = sum +k;

        System.out.println("The Total Sum: Num+K = "+sum);
        array_form(num.length,reverse(sum));
    }

    static int reverse(int sum){
        int reverse = 0;
        while (sum!=0){
            int remainder = sum%10;
            reverse = (reverse*10)+remainder;
            sum = sum/10;
      }
        return reverse;
    }

    static void array_form(int count, int reverse) {
        int[] arr = new int[count];

        for (int i = 0; i < arr.length; i++) {
            int remainder = reverse%10;
            arr[i] = remainder;
            reverse = reverse/10;
        }

        System.out.println("The Array_Form of Num+k: ");

        for (int j:
             arr) {
            System.out.print(j+" ");
        }
    }
}
