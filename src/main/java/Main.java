public class Main {
    public static void main(String[] args) {

        Deck myDeck = new Deck();
        System.out.println(myDeck.fullDeck());
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println(myDeck.shuffleCard());
        System.out.println("-------------------------------------------------------------------------------------------------");

        myDeck.getTwoCard();
        System.out.println(myDeck.getCardsOnDeck());
//        System.out.println(myDeck.fullDeck());
//        System.out.println("-------------------------------------------------------------------------------------------------");
////        myDeck.getTwoCard();
//        System.out.println(myDeck.fullDeck());
//
//        System.out.println(myDeck.fullDeck().size());
//        System.out.println();

//        Game game = new Game();
//        System.out.println(game.StartGame());
//        System.out.println(game.StartGame());

    }


}
