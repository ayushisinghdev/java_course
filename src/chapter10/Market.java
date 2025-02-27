package chapter10;

public class Market {

    public static void main(String args[]){

        Fruit fruit = new Fruit();
        fruit.makeJuice();

        Fruit apple = new Apple();
        apple.makeJuice();

        apple = new Banana();
        ((Banana) apple).peel();

        Apple apple1 = new Apple();
        apple1.removeSeeds();

        Fruit banana = new Banana();
        banana.makeJuice();

    }
}
