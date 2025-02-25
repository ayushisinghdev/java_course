package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args){
        int [] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }

    public static int[] generateNumbers(){

        int[] ticket = new int[LENGTH];
        Random random = new Random();
        for (int i =0; i< LENGTH; i++){
            int randomNumber;
            // to check if the number already exists in the array, if it does regenerate and search again
            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            }while(search(ticket, randomNumber));
            //number is unique, add to the array
            ticket[i] = randomNumber;
        }
        return ticket;
    }

    /**
     * Does a sequential search on the array to find the value
     * @param array Array to search through
     * @param numberToSearchFor Value to search for
     * @return true if found, false if not
     */
    private static boolean search(int[] array, int numberToSearchFor) {

        //enhanced loop
        for(int value: array){
            if(value == numberToSearchFor)
                return true;
        }

        // if we have reached this point, then the entire
        // array was searched and teh value was not found
        return false;
    }

    public static boolean binarySearch(int[] array, int numberToSearchFor){

        //array must be sorted first
        Arrays.sort(array);
        int index =  Arrays.binarySearch(array, numberToSearchFor);
        if(index >= 0)
            return true;
        else return false;
    }

    public static void printTicket(int ticket[]){
        for(int i = 0; i< LENGTH; i++){
            System.out.print(ticket[i] + " | ");
        }
    }
}
