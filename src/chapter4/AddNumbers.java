package chapter4;
/* Do while loop
Write a program that allows a user to enter two numbers,
and then sums up the two numbers. The user should be able to
repeat this action until they indicate they are done.
 */

import java.util.Scanner;

public class AddNumbers {

    public static void main(String args[]){

        boolean again = false;
        Scanner scanner = new Scanner(System.in);

        do{

            System.out.println("Enter the first number");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the second number");
            double num2 = scanner.nextDouble();

            double sum = num2 + num1;
            System.out.println("Sum is " + sum);

            System.out.println("Do you like to start over?");
            again = scanner.nextBoolean();

        }while(again);

        scanner.close();
    }
}
