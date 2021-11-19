import java.util.List;

public class Main {
    public static void main(String[] args) {
        Deck myDeck = new Deck();
        System.out.println("\n................DISPLAY THE FULL CARDS -----------------------");
        System.out.println(myDeck.fullDeck());

        System.out.println("\n.........LET PLAY BY SHUFFLING THE CARDS --------------------");
        System.out.println(myDeck.shuffleCard());

        System.out.println("\n-----------------GET TWO CARDS FROM THE DECK OF CARDS -------------------");
        System.out.println(myDeck.getTwoCard());
//      System.out.println(myDeck.getOneCard());
        System.out.println("\n-----------------PRINT OUT THE REMAINING CARDS AFTER GETTING TWO CARDS -------------------");
        System.out.println(myDeck.getCards().size());

        System.out.println("\n-------------------PRINT OUT THE SUM OF THE VALUES---------------");
        System.out.println(myDeck.getTotalUserCardsValue());


        System.out.println("\n------------------------GAME START---------------------");
//      Game newGame = new Game(new Player("Selasi"), myDeck);
        Game oldGame = new Game(List.of(new Player("edward"),new Player("Selasi")),myDeck);
        System.out.println(oldGame);

    }


}
