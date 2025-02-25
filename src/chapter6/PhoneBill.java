package chapter6;

public class PhoneBill {

    private int id;
    private double baseCost;
    private int allottedMinutes;
    private int minutesUsed;
    private int overageMinutes;

    public PhoneBill(){
        id =0;
        baseCost = 80;
        allottedMinutes = 800;
        minutesUsed = 800;
    }

    public PhoneBill(int id){
        this.id = id;
        baseCost = 80;
        allottedMinutes = 800;
        minutesUsed = 800;
    }

    public PhoneBill(int id, double baseCost, int allottedMinutes, int minutesUsed){
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public double getBaseCost(){
        return baseCost;
    }

    public void setBaseCost(double baseCost){
        this.baseCost = baseCost;
    }

    public int getAllottedMinutes(){
        return allottedMinutes;
    }

    public void setAllottedMinutes(int allottedMinutes){
        this.allottedMinutes = allottedMinutes;
    }

    public int getMinutesUsed(){
        return minutesUsed;
    }

    public void setMinutesUsed(int minutesUsed){
        this.minutesUsed = minutesUsed;
    }

    public double calculateOverageMinutes(){
        if (minutesUsed <= allottedMinutes)
            return 0;
        overageMinutes = minutesUsed - allottedMinutes;
        return overageMinutes;}

    public double calculateOverage(){
        if (minutesUsed <= allottedMinutes)
            return 0;
        double overageRate = 0.25;
        overageMinutes = minutesUsed - allottedMinutes;
        return overageMinutes * overageRate;
    }

    public double calculateTax(){
        double taxRate = 0.15;
        return taxRate * (calculateOverage() + baseCost);
    }

    public double calculateTotal(){
        return baseCost + calculateTax() + calculateOverage();
    }

    public void printItemizedBill(){
        System.out.println("Your id is: " + id);
        System.out.println("Base Cost is:" + baseCost);
        System.out.println("You had " + allottedMinutes + " minutes to use.");
        System.out.println("You have used " + calculateOverageMinutes() + " minutes.");
        System.out.println("You are charged $" + calculateOverage() + " for " + calculateOverageMinutes() + " minutes.");
        System.out.println("Your tax amount is $" + calculateTax());
        System.out.println("Your total bill is $" + calculateTotal());
    }

}
