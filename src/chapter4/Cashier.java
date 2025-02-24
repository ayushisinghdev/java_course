package chapter4;

import java.util.Scanner;

/* For loop
Write a program that will scan a given number of items and tally the cost.
 */
public class Cashier {

    public static void main(String args[]){

        //Get the number of items to scan
        System.out.println("Enter the number of items you would like to scan:");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        double total = 0;

        //Create loop to iterate through all of the items and accumulate teh costs
        for(int i = 0; i<quantity; i++){

            System.out.println("Enter the cost of the item:");
            double price = scanner.nextDouble();

            total = total + price;

        }

        scanner.close();

        System.out.println("Total bill is $" + total );
    }
}
