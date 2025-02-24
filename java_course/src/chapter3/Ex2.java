package chapter3;

/*
So, you're going to create a program that asks the user to enter the quantities for the following coins.

You'll ask them how many pennies would you like?
How many nickels would you like?
How many dimes?
And then, how many quarters?
What your program is going to do is count up the value of all of the change that they answered.

If it's exactly one dollar then they win the game.
If it's more than one dollar, then you need to tell them that it's more than one dollar and how much they went over.
If it's less than one dollar, tell them how much they went under.

 */

import java.util.Scanner;

public class Ex2 {

    public static void main(String args[]){

       double penny = 0.01;
       double nickel = 0.05;
       double dime = 0.1;
       double quarter = 0.25;
       double dollar = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of pennies you have:");
        int numberOfPenny = scanner.nextInt();
        System.out.println("Enter the number of nickel you have:");
        int numberOfNickel = scanner.nextInt();
        System.out.println("Enter the number of dime you have:");
        int numberOfDime = scanner.nextInt();
        System.out.println("Enter the number of quarter you have:");
        int numberOfQuarter = scanner.nextInt();

        double diff;

        double actualAmount = (numberOfPenny * penny + numberOfDime * dime + numberOfNickel * nickel + numberOfQuarter * quarter) ;
        if(actualAmount == dollar){
            System.out.println("Congrats! you won.");
        } else if (actualAmount < dollar) {
            diff = (dollar - actualAmount);
            System.out.println("Oops you are $" + diff + " short");
        } else {
            diff = (actualAmount - dollar);
            System.out.println("Oops you are $" + diff + " ahead");
        }

    }
}
