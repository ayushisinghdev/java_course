package chapter3.chapter3e_switch;

import java.util.Scanner;

public class GradeMessage {

    public static void main(String args[]){

        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        String message;

        switch(grade){
            case "A":
                message = "Excellent!";
                break;
            case "B":
                message = "Great!";
                break;
            case "C":
                message = "Good!";
                break;
            case "D":
                message = "You need to work a bit harder!";
                break;
            case "F":
                message = "Uh oh!";
                break;
            default:
                message = "Error. Invalid grade!";
                break;
        }

        System.out.println(message);
    }
}
