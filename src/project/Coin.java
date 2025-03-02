package project;

import java.util.Random;

public class Coin {

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    private String side;
    public static String HEADS = "Heads";
    public static String TAILS = "Tails";

    public String flip(){
        if (new Random().nextBoolean()){
            setSide(HEADS);
        }else
            setSide(TAILS);
        return getSide();
    }

}
