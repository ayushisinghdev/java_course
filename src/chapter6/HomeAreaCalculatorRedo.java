package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        double area = calculator.calculateTotalArea(kitchen, bathroom);
        System.out.println("Total Area is " + area);

        calculator.scanner.close();
    }

    public Rectangle getRoom(){

        System.out.println("Enter the length of your room:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room:");
        double width = scanner.nextDouble();

        Rectangle room = new Rectangle(length, width);
        return room;


    }

    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}
