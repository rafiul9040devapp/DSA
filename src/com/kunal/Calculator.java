package com.kunal;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ans = 0 ;

        while (true){
            System.out.println("Enter the operator: ");
            char op = input.next().trim().charAt(0);
            System.out.println();

            if(op == '+' || op == '-' ||  op == '*' || op == '/' || op == '%'){
                System.out.print("Enter the first numbers:");
                 int num1 = input.nextInt();
                System.out.print("Enter the second numbers:");
                 int num2 = input.nextInt();
                System.out.println();

                 if (op == '+'){
                     ans = num1+num2;
                 }

                if (op == '-'){
                    ans = num1 - num2;
                }

                if (op == '*'){
                    ans = num1 * num2;
                }

                if (op == '/'){
                  if (num2!=0){
                      ans = num1/num2;
                  }
                }

                if (op == '%'){
                    ans = num1% num2;
                }
            }

            else if (op == 'x' || op =='X'){
                break;
            }

            else {
                System.out.println("INVALID OPERATOR");
            }

            System.out.println(ans);
        }

    }
}
