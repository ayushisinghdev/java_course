package chapter10;

public class Cat extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Meow meow");
    }

    public void scratch(){
        System.out.println("Scratch is fun");
    }
}
