package chapter9;

public class TasteTester {

    public static void main(String args[]){

    Cake cake = new Cake("Cake");
    System.out.println("Cake " + cake.getFlavor());

    BirthdayCake birthdayCake = new BirthdayCake();
    System.out.println("Birthday cake " + birthdayCake.getFlavor());

    WeddingCake weddingCake = new WeddingCake();
    System.out.println("Wedding cake " + weddingCake.getFlavor());
}}
