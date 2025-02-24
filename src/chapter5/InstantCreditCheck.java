package chapter5;

/* variable scope
Write an "instant credit check" program that approves
anyone who makes more than $25000 and has a credit score of
700 or better. Reject all others
 */

import java.util.Scanner;

public class InstantCreditCheck {
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void  main(String args[]){

        //Initialize what we know


        //get what we don't know
        double salary = getSalary();
        double creditScore =  getCreditScore();
        scanner.close();

        //Check if user is qualified
        boolean eligibility = isUserQualified(salary, creditScore);

        //Notify the user
        eligibilityNotification(eligibility);

    }
    public static double getSalary() {
        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();
        return salary;
    }
    public static double getCreditScore(){
        System.out.println("Enter your credit score:");
        double creditScore = scanner.nextDouble();
        return creditScore;
    }

    public static boolean isUserQualified(double salary, double creditScore) {
        if(salary > requiredSalary && creditScore > requiredCreditScore)
            return true;
        else
            return false;
    }

    public static void eligibilityNotification(boolean eligibility){
        if (eligibility == true)
            System.out.println("Congrats! you are eligible.");
        else
            System.out.println("Oops! you don't satisfy the conditions.");
    }
}
