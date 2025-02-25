package chapter7;

import java.util.Scanner;

/**
 * array - textual values of days of week
 * user input - day number
 * week start at monday
 * output - string corr. to the day number
 */

public class DayOfTheWeek {

    private static Scanner scanner = new Scanner(System.in);
    private static int day;

    public static void main(String args[]){

        String[] week = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
        getUserInput();
        printDay(day, week);
    }

    public static int getUserInput(){
        System.out.println("Enter the number of day of the week");
        day = scanner.nextInt();
        while (day<0 || day>6){
            System.out.println("Enter a value from 0 to 6");
            day = scanner.nextInt();
        }
        return day;
    }

    public static void printDay(int day, String[] week){
        System.out.println("The day is " + week[day]);
    }
}
