package chapter4;

/* Nested loops
Find the average of each student's test scores
 */

import java.util.Scanner;

public class AveragetestScores {

    public static void main(String args[]){

        //Initialize what we know
        int numberOfStudents = 24;
        int numberOfTests = 4;

        Scanner scanner = new Scanner(System.in);

        //Process all students
        for(int i =0; i< numberOfStudents; i++){

            double total = 0;
            for(int j = 0; j< numberOfTests; j++){

                System.out.println("Enter you marks for the test #" + (j+1));
                double score = scanner.nextDouble();
                total = total + score;
            }

            double average = total/numberOfTests;
            System.out.println("the test average for student #" + (i+1) + " is " + average);

        }

        scanner.close();


    }
}
