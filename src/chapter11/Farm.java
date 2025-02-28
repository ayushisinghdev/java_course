package chapter11;

public class Farm {

    public static void main(String args[]){

        Animal duck = new Duck();
        duck.makeSound();

        Animal pig = new Pig();
        pig.makeSound();

        pig = new Duck();
        pig.makeSound();

        Duck duck1 = new Duck();
        duck1.makeSound();


    }
}
