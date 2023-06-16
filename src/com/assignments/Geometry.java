package com.assignments;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Choose an option:  ");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Rectangle");
        System.out.println("4. Square");
        System.out.println("5. Rhombus");
        System.out.println("6. Parallelogram");
        System.out.println("7. Cone");
        System.out.println("8. Prism");
        System.out.println("9. Cylinder");
        System.out.println("10. Pyramid");
        System.out.println("11. Cube");

        int option = input.nextInt();

        switch (option){
            case 1:
                System.out.println("Enter The Radius Of The Circle:  ");
                double radius = input.nextDouble();
                circle(radius);
                break;
            case 2:
                System.out.println("Choose a Type Of Triangle: ");
                System.out.println("1. Isosceles Triangle");
                System.out.println("2. Equilateral Triangle");
                int choice = input.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("Enter The Base: ");
                        double base = input.nextDouble();
                        System.out.println("Enter The Side: ");
                        double side = input.nextDouble();
//                        System.out.println("Enter The Height: ");
//                        double height = input.nextDouble();
                        isosceles(base,side);
                        break;
                    case 2:
                        System.out.println("Enter The Side: ");
                        double equalSide = input.nextDouble();
                        equilateral(equalSide);
                        break;
                }
                break;
            case 3:
                System.out.println("Enter the width of Rectangle: ");
                double width = input.nextDouble();
                System.out.println("Enter the length of Rectangle: ");
                double length = input.nextDouble();
                rectangle(width,length);
                break;
            case 4:
                System.out.println("Enter The Side Of The Square: ");
                double side= input.nextDouble();
                square(side);
                break;
            case 5:
                System.out.println("Enter the side of Rhombus: ");
                double sideR = input.nextDouble();
                System.out.println("Enter the first Diagonal Of Rhombus: ");
                double d1 = input.nextDouble();
                System.out.println("Enter The Second Diagonal Of Rhombus: ");
                double d2 = input.nextDouble();
                rhombus(sideR,d1,d2);
                break;
            case 6:
                System.out.println("Enter the base of the Parallelogram: ");
                double base = input.nextDouble();
                System.out.println("Enter the side of the Parallelogram: ");
                double sideP = input.nextDouble();
                System.out.println("Enter the height of the Parallelogram: ");
                double height = input.nextDouble();
                parallelogram(base, sideP,height);
                break;
            case 7:
                System.out.println("Enter the radius of the Cone: ");
                double radiusCone = input.nextDouble();
                System.out.println("Enter the Height of the Cone: ");
                double heightCone = input.nextDouble();
                cone(radiusCone,heightCone);
                break;
            case 8:
                System.out.println("Enter the width of Prism: ");
                double widthP  = input.nextDouble();
                System.out.println("Enter the length of Prism: ");
                double lengthP = input.nextDouble();
                System.out.println("Enter the height of Prism: ");
                double heightP = input.nextDouble();
                prism(widthP,lengthP,heightP);
                break;
            case 9:
                System.out.println("Enter the radius of the Cylindaer: ");
                double radiusCylinder = input.nextDouble();
                System.out.println("Enter the Height of the Cone: ");
                double heightCylinder = input.nextDouble();
                cylinder(radiusCylinder,heightCylinder);
                break;
            case 10:
                System.out.println("Enter the width of Pyramid: ");
                double widthPy  = input.nextDouble();
                System.out.println("Enter the length of Pyramid: ");
                double lengthPy = input.nextDouble();
                System.out.println("Enter the height of Pyramid: ");
                double heightPy = input.nextDouble();
                pyramid(widthPy,lengthPy,heightPy);
                break;
            case 11:
                System.out.println("Enter The Side Of The Cube: ");
                double sideCube= input.nextDouble();
                cube(sideCube);
                break;
            default:
                System.out.println("Invalid Option");
        }
    }

    static void circle(double radius) {

        double area = Math.PI * Math.pow(radius,2);
        double perimeter = 2 * Math.PI * radius;
        double volume = (4/3) * Math.PI * Math.pow(radius,3);
         System.out.println("Area Of The Circle Is: "+ area );
         System.out.println("Perimeter Of The Circle Is: "+perimeter);
         System.out.println("Volume Of The Circle Is: "+volume);
    }

    static void isosceles(double base, double side) {

        double height =  Math.sqrt(  Math.pow(side,2) - (Math.pow(base,2) /4) );
        double area = .5 * base * height;
        double perimeter = (2*side) + base;

        System.out.println("The Area Of The Isosceles Triangle:  "+ area);
        System.out.println("The Perimeter Of The Isosceles Triangle:  "+ perimeter);
    }

     static void equilateral(double equalSide) {

        double area = (Math.sqrt(3)/4) * Math.pow(equalSide,2);
        double perimeter = 3 * equalSide;

         System.out.println("The Area Of The Equilateral Triangle: "+ area);
         System.out.println("The Perimeter Of The Equilateral Triangle: "+perimeter);
    }

    static void rectangle(double width, double length) {
        double area = width*length;
        double perimeter = 2*(width+length);

        System.out.println("The Area Of The Rectangle: "+ area);
        System.out.println("The Perimeter Of The Rectangle: "+ perimeter);

    }

    static void square(double side) {
        double area = Math.pow(side,2);
        double perimeter= 4*side;

        System.out.println("The Area Of The Square: "+ area);
        System.out.println("The Perimeter Of The Square: "+ perimeter);
    }

    static void rhombus(double side,double d1, double d2) {
        double area = .5*(d1*d2);
        double perimeter = 4*side;

        System.out.println("The Area Of The Rhombus: "+ area);
        System.out.println("The Perimeter Of The Rhombus: "+ perimeter);
    }

    static void parallelogram(double base, double sideP, double height) {
        double area = base* height;
        double perimeter = 2*(base+sideP);

        System.out.println("The Area Of The Parallelogram: : "+ area);
        System.out.println("The Perimeter Of The Parallelogram: "+ perimeter);
    }

    static void cone(double radiusCone, double heightCone) {
        double volume = (1/3)* Math.PI* Math.pow(radiusCone,2)*heightCone;
        double slantHeight = Math.sqrt((Math.pow(radiusCone,2)+Math.pow(heightCone,2)));
        double surfaceArea = Math.PI* radiusCone *(radiusCone+slantHeight);

        System.out.println("The Surface Area Of The Cone : "+ surfaceArea);
        System.out.println("The Volume Of Cone: "+ volume);
    }

    static void prism(double widthP, double lengthP, double heightP) {
        double baseArea = widthP *lengthP;
        double volume = baseArea * heightP;

        System.out.println("The Volume Of the Prism: "+ volume);
    }

    static void cylinder(double radiusCylinder, double heightCylinder) {
        double volume = Math.PI * Math.pow(radiusCylinder,2) * heightCylinder;
        double lateralSurfaceArea = 2*Math.PI*radiusCylinder*heightCylinder;
        double surfaceArea = 2*Math.PI*radiusCylinder*(heightCylinder+radiusCylinder);

        System.out.println("The Lateral Surface Area Of Cylinder: "+ lateralSurfaceArea);
        System.out.println("The Surface Area Of Cylinder: "+ surfaceArea);
        System.out.println("The Volume Of Cylinder: "+ volume);
    }

    static void pyramid(double widthPy, double lengthPy, double heightPy) {
        double volume = (1/3) * widthPy* lengthPy*heightPy;

        System.out.println("The volume of the Pyramid: "+volume);
    }

    static void cube(double sideCube) {
        double surfaceArea = 6 * Math.pow(sideCube,2);
        double volume = Math.pow(sideCube,3);

        System.out.println("The Surface Area Of Cube: "+ surfaceArea);
        System.out.println("The Volume Of Cube: "+ volume);
    }

}
