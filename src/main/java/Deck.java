import java.util.*;

public class Deck {

    private ArrayList<Cards> cards;
    List<Cards> userOneCard;

    public Deck() {
        this.cards = new ArrayList<Cards>();
    }

    public ArrayList<Cards> getCards() {
        return cards;
    }


    public ArrayList<Cards> fullDeck(){
        for (CardSuits cardSuits : CardSuits.values()){
            for (CardValue cardValue :  CardValue.values()){
                this.cards.add(new Cards(cardSuits,cardValue.getValue()));
            }
            shuffleCard();
        } return cards;
    }


    public void shuffleCard(){
       Collections.shuffle(cards);
    }


    public void getOneCard(){
         cards.remove(0);

    }



    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + cards +
                '}';
    }
}
