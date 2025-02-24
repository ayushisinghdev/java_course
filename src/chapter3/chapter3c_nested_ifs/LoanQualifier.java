package chapter3.chapter3c_nested_ifs;

/*
Nested Ifs
To qualify for a loan, a person must make at least $30,000
and have been working at their current job for at least 2 years
 */

import java.util.Scanner;

public class LoanQualifier {
    public static void main(String args[]){

        //Initialize what we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        // get what we don't
        System.out.println("enter your salary:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("enter the no. of years with your current employer:");
        double years = scanner.nextDouble();

        scanner.close();

        //Make decision
        if (salary >= requiredSalary){
            if (years >= requiredYearsEmployed){
                System.out.println("Congrats! You qualify for the loan");
            }
            else{
                System.out.println("Sorry, you must have not completed your " + requiredYearsEmployed + " years with your current employer.");
            }
        }
        else {
            System.out.println("Sorry, you salary must be at least $" + requiredSalary);
        }
    }
}
