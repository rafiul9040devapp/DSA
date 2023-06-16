package com.kunal;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        String fruit = in.next();
//
//
//     switch (fruit){
//         case "Mango":
//             System.out.println("King of fruits");
//             break;
//         case "Apple":
//             System.out.println("A sweet red fruit");
//             break;
//         case "Orange":
//             System.out.println("A round fruit");
//             break;
//         case "Grapes":
//             System.out.println("A small fruit");
//             break;
//         default:
//             System.out.println("Please enter a valid fruit");
//     }

//        int day = in.nextInt();
//
//        switch (day){
//            case 1:
//                System.out.println("Sunday");
//                break;
//            case 2:
//                System.out.println("Monday");
//                break;
//            case 3:
//                System.out.println("Tuesday");
//                break;
//            case 4:
//                System.out.println("Wednesday");
//                break;
//            case 5:
//                System.out.println("Thursday");
//                break;
//            case 6:
//                System.out.println("Friday");
//                break;
//            case 7:
//                System.out.println("Saturday");
//                break;
//            default:
//                System.out.println("INVALID");
//        }
//
//        System.out.println();
//
//        switch (day){
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekdays");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekends");
//                break;
//            default:
//                System.out.println("Invalid");
//        }

        int employeeID = in.nextInt();
        String department = in.next();

        switch (employeeID){
            case 1:
                System.out.println("Kunal Khuswaha");
                break;
            case 2:
                System.out.println("Nitish Rana");
                break;
            case 3:
                System.out.println("Employee Number 3");
                switch (department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No Department Entered");
                        break;
                }
                break;
            default:
                System.out.println("Enter Correct Employee ID");
                break;
        }


    }
}
