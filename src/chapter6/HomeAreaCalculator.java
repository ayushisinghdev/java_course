package chapter6;

/* write a class that creates instances of the rectangle class to find the
total area of 2 rooms in a house
 */

public class HomeAreaCalculator {

    public static void main(String args[]){

        /******************
         * RECTANGLE 1
         *******************/

        //Create instance of rectangle class
        Rectangle room1 = new Rectangle();
        room1.setWidth(25);
        room1.setLength(50);
        double areaOfRoom1 = room1.calculateArea();

        /******************
         * RECTANGLE 2
         *******************/

        //Create instance of rectangle class
        Rectangle room2 = new Rectangle(30,75);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom2 + areaOfRoom1;

        System.out.println("Total Area is " + totalArea);

    }
}
