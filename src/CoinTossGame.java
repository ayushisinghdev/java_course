import java.util.Scanner;

public class CoinTossGame {

    private Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){

        CoinTossGame game = new CoinTossGame();
        game.scanner = new Scanner(System.in);
        Player player1 = new Player("Ayushi");
        Player player2 = new Player("Veena");

        player1.setGuess(game.askGuess());
    }

    public String askGuess(){
        String prompt = String.format("%s or %s?", Coin.HEADS, Coin.TAILS);
        System.out.println(prompt);
        String guess = scanner.nextLine();
    }
}
