package chapter10;

public class Apple extends Fruit{

    public void removeSeeds(){
        System.out.println("Remove seed");
    }

    public Apple(){
        setCalories(10);
    }

    @Override
    public void makeJuice() {
        System.out.println("Apple Juice");
    }
}
