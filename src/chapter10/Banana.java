package chapter10;

public class Banana extends Fruit{

    public void peel(){
        System.out.println("Peel");
    }

    public Banana(){
        setCalories(20);
    }

    @Override
    public void makeJuice() {
        System.out.println("banana juice");
    }
}
