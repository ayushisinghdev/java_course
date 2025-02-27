package chapter10;

public class Fruit {

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    private double calories;

    public void makeJuice(){
        System.out.println("Juice is made");
    }
}
