package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        House blueHouse = new House("blue");
        House anotherHouse = blueHouse;

        System.out.println(blueHouse.getColor());
        System.out.println(anotherHouse.getColor());

        anotherHouse.setColor("Yellow");

        System.out.println(anotherHouse.getColor());
        System.out.println(blueHouse.getColor());

        House greenHouse = new House("green");
        anotherHouse = greenHouse;

        System.out.println(blueHouse.getColor());
        System.out.println(anotherHouse.getColor());
        System.out.println(greenHouse.getColor());

        Animal animal = new Animal("Animal",1,1,5,5);

        Dog dog = new Dog("Yorkie",8,20,2,4,1,20,"Long Silky");
        dog.eat();
        dog.walk();
        dog.run();

        Fish fish = new Fish("Salmon", 6,25,4,2,10);
        Fish anotherFish = fish;

        
        


        Car porsche = new Car();
        //Car holden = new Car();

        porsche.setModel("911");

        System.out.println("The model of Porsche is: "+ porsche.getModel());

        BankAccount account1 = new BankAccount();

        //1234,0.0,"Bob Brown","myemailbob@gmail.com","01611355055") ;

        System.out.println(account1.getName());
        System.out.println(account1.getAccountNumber());
        System.out.println(account1.getBalance());
        System.out.println(account1.getEmail());
        System.out.println(account1.getPhoneNumber());

        //account1.setAccountNumber(1234);
        //account1.setBalance(0.0);
        //account1.setName("Bob Brown");
        //account1.setEmail("myemailbob@gmail.com");
        //account1.setPhoneNumber("01611355055");

        account1.deposit(50);
        account1.withdrawal(100);

        account1.deposit(51);
        account1.withdrawal(200);

        BankAccount account2 = new BankAccount("Tim","myemailtim@gmail.com","01763653626");
        System.out.println(account2.getName());
        System.out.println(account2.getAccountNumber());
        System.out.println(account2.getBalance());
        System.out.println(account2.getEmail());
        System.out.println(account2.getPhoneNumber());



        VipCustomer v1 = new VipCustomer("Bob Marly","myemailmarly@gmail.com",3500);
        System.out.println(v1.getName());
        System.out.println(v1.getEmailAddress());
        System.out.println(v1.getCreditLimit());

        VipCustomer v2 = new VipCustomer("Eren","myemaileren@gmail.com");
        System.out.println(v2.getName());
        System.out.println(v2.getEmailAddress());
        System.out.println(v2.getCreditLimit());

        VipCustomer v3 = new VipCustomer();
        System.out.println(v3.getName());
        System.out.println(v3.getEmailAddress());
        System.out.println(v3.getCreditLimit());


        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (true){

            int rotate = count +1;
            System.out.println("Enter the number "+rotate+": ");
            boolean hasNextInt =  scanner.hasNextInt();

                if (hasNextInt){
                    int input = scanner.nextInt();
                    count++;

                    if (input>max){
                        max = input;
                    }
                    if (input<min){
                        min = input;
                    }
                }

                else {
                    System.out.println("Invalid Input");
                    break;
                }
        }
        System.out.println("Minimum number: "+ min);
        System.out.println("Maximum number: "+max);
        scanner.close();
    }
}
