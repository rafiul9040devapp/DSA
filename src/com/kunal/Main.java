package com.kunal;

public class Main {
    public static void main(String[] args){
      // pattern1(4);
        //pattern2(4);
        //pattern3(5);
        //pattern4(5);
        //pattern5(5);
        //pattern28(5);
        //pattern30(5);
        pattern17(4);
    }

    static void pattern1(int n){
        for (int row =1; row<= n ; row++){
            //for every row , run the col
            for(int col =1; col<=n; col++){
                System.out.print("* ");
            }
            //when one row is printed we need new line
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int row =1; row<= n ; row++){
            //for every row , run the col
            for(int col =1; col<=row; col++){
                System.out.print("* ");
            }
            //when one row is printed we need new line
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int row =1; row<= n ; row++){
            //for every row , run the col
            for(int col =1; col<= (n-row+1); col++){
                System.out.print("* ");
            }
            //when one row is printed we need new line
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int row =1; row<= n ; row++){
            //for every row , run the col
            for(int col =1; col<=row; col++){
                System.out.print(col +" ");
            }
            //when one row is printed we need new line
            System.out.println();
        }
    }

    static void pattern5(int n){
        for (int row = 1; row <= (2*n)-1 ; row++) {
            int totalNumberOfColumns = row>n ?(2*n)-row :row;
            for (int col = 0; col < totalNumberOfColumns; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static void pattern28(int n){
        for (int row = 1; row <= (2*n)-1 ; row++) {
            int totalNumberOfColumns = row>n ?(2*n)-row :row;

            int noOfSpaces = n - totalNumberOfColumns;
            for (int spaces = 0; spaces < noOfSpaces; spaces++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalNumberOfColumns; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static void pattern30(int n){
        for (int row = 1; row <=n ; row++) {
            for (int spaces = 0; spaces < n-row; spaces++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1 ; col--) {
                System.out.print(col+" ");
            }

            for (int col = 2; col <=row ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }

    }

    static void pattern17(int n){
        for (int row = 1; row <= (2*n)-1 ; row++) {

            int totalNumberOfColumns = row>n?(2*n)-row:row;

            for (int spaces = 0; spaces < n-totalNumberOfColumns; spaces++) {
                System.out.print("  ");
            }

            for (int col = totalNumberOfColumns; col >= 1 ; col--) {
                System.out.print(col+" ");
            }

            for (int col = 2; col <=totalNumberOfColumns ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }

    }
}
