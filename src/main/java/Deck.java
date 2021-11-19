import java.util.*;

public class Deck {

    private ArrayList<Cards> cards = new ArrayList<Cards>();
    ArrayList<Cards> userOneCard = new ArrayList<Cards>();

    public Deck() {
        this.cards = new ArrayList<Cards>();
    }

    public ArrayList<Cards> getCards() {
        return cards;
    }


    public ArrayList<Cards> fullDeck() {
        for (CardSuits cardSuits : CardSuits.values()) {
            for (CardValue cardValue : CardValue.values()) {
                this.cards.add(new Cards(cardSuits, cardValue.getValue()));
            }
//            shuffleCard();
        }
        return cards;
    }

    public ArrayList<Cards> shuffleCard() {
        Collections.shuffle(cards);
        return cards;
    }
//    public void shuffleCard(){
//       Collections.shuffle(cards);
//    }

    public ArrayList<Cards> getCardsOnDeck(){
        return cards;
    }

    //
    public void getTwoCard() {
        for (int i = 0; i < 2; i++) {
            Cards getCard = cards.get(0);
            userOneCard.add(getCard);
            cards.remove(0);

        }

//    }

//    public void getOneCard(){
//        cards.remove(0);
//    }


//    @Override
//    public String toString() {
//        return "Deck{" +
//                "cards=" + cards +
//                '}';
//    }
    }
}
