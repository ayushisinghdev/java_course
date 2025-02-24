package chapter2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String arg[]){

        //1. get the season of the year
        System.out.println("Enter the season.");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        //2. get the number of cups of coffee
        System.out.println("Enter the number of cups of coffee.");
        int cup = scanner.nextInt();

        //3. get the adjective for the day
        System.out.println("Enter the adjective.");
        String adj = scanner.next();

        //4. print the output
        System.out.println("On a " + adj + " " + season + " day, I drink a minimum of " + cup + " cups of coffee." );

    }
}
