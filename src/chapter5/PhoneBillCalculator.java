package chapter5;

import java.util.Scanner;

/*
Final total of someone's cell phone bill
operator will i/p plan fee & no of overage min
charge 0.25/min over the plan + 15% tax on sub total
methods - calculate tax, overage fees and final total
print itemized bill
 */
public class PhoneBillCalculator {
    static double overageCharge = 0.25;
    static double tax = 15;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){

        double planFee = planFee();
        double overageMin = overageMin();
        scanner.close();
        double overageFees = calculateOverageFees(overageMin);
        double subTotal = getSubTotal(planFee,overageFees);
        double taxToBePaid = calculateTax(subTotal);
        double finalBill = calculateFinalBill(subTotal,taxToBePaid);
        printItemizedBill(planFee,overageFees,subTotal,taxToBePaid,finalBill);
    }

    public static double planFee(){
        System.out.println("Enter the plan fee:");
        double planFee = scanner.nextDouble();
        return planFee;
    }
    public static double overageMin(){
        System.out.println("Enter the overage min:");
        double overageMin = scanner.nextDouble();
        return overageMin;
    }
    public static double calculateOverageFees(double overageMin){
        double overageFees = overageMin*overageCharge;
        return overageFees;
    }
    public static double getSubTotal(double planFee,double overageFees){
        double subTotal = planFee + overageFees;
        return subTotal;
    }
    public static double calculateTax(double subTotal){
        double taxToBePaid = ((tax/100)*subTotal);
        return taxToBePaid;
    }
    public static double calculateFinalBill(double subTotal,double taxToBePaid){
        double finalBill = taxToBePaid + subTotal;
        return finalBill;
    }
    public static void printItemizedBill(double planFee, double overageFees, double subTotal, double taxToBePaid, double finalBill){
        System.out.println("Your plan fee is " + planFee);
        System.out.println("Your overage fee is " + overageFees);
        System.out.println("Your sub total is " + subTotal);
        System.out.println("Your tax is " + taxToBePaid);
        System.out.println("Your final bill is " + finalBill);
    }
}
