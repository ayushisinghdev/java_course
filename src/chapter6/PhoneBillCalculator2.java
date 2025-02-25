package chapter6;

public class PhoneBillCalculator2 {

    public static void main(String args[]){

        PhoneBill bill = new PhoneBill(123);
        bill.setMinutesUsed(1000);
        bill.printItemizedBill();

        }
    }

