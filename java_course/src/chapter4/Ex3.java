package chapter4;

import java.util.Scanner;

/*
20 spaces
5 die rolls - 1 to 6 values
display - current space and spaces to go
repeat 4 more times (5 die rolls)
end if user reaches 20 before 5 die rolls - won
< > 20 - lose
current space !> 20
 */

/*Random random = new Random();
int die = random.nextInt(6) + 1;*/
public class Ex3 {

    public static void main(String args[]){

        // what is known
        int currentSpace = 0;
        int dieRoll = 5;
        int maxValue = 6;
        int dieValue;
        int diff;
        int win = 20;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < dieRoll; i++){

            System.out.println("Enter the dice value you got on the roll");
            dieValue = scanner.nextInt();
            while (dieValue < 0 || dieValue > maxValue){
                System.out.println("Die value must be between 1 to 6");
                dieValue = scanner.nextInt();
            }
            currentSpace = currentSpace + dieValue;
            if(currentSpace == win){
                System.out.println("You are at " + currentSpace + " currently") ;
                break;
            }
            if (currentSpace > win) {
                currentSpace = currentSpace - dieValue;
            }
            System.out.println("You are at " + currentSpace + " currently") ;
            }
        if (currentSpace < win){
            diff = win - currentSpace;
            System.out.println("Oops! you are " + diff + " spaces away from win");
        }
        else {
            System.out.println("Congrats! you won");
        }
    }
}
