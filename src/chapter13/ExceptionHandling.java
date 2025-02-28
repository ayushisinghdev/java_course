package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String [] args){

        createNewFile();
        numberExceptionHandling();
    }

    public static void createNewFile(){
        File file = new File("resource/nonexistent.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Directory does not exists.");

        }
    }

    public static void createNewFileRethrow() throws IOException{
        File file = new File("resource/nonexistent.txt");
            file.createNewFile();
    }

    public static void numberExceptionHandling(){
        File file = new File("resources/numbers.txt");
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(file);
            while (fileReader.hasNext()){
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        }
         catch (Exception e){
            e.printStackTrace();
        }finally {
            fileReader.close();
        }
    }
}
