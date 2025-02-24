package chapter3.chapter3f_relational_operators;

import java.util.Scanner;

public class LogicalOperatorLoanQualifier {

/*
Logical operators
To qualify for a loan, a person must make at least $30,000
and have been working at their current job for at least 2 years
 */

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
        if (salary >= requiredSalary && years >= requiredYearsEmployed){
                System.out.println("Congrats! You qualify for the loan");
            }
        else {
            System.out.println("Sorry!");
        }
    }
}
