import java.util.ArrayList;
import java.util.List;

public class Deck {

    private ArrayList<Cards> cards;

    public Deck() {
        this.cards = new ArrayList<Cards>();
    }

    public ArrayList<Cards> getCards() {
        return cards;
    }

    public  void fullDeck(){
        for (CardSuits cardSuits : CardSuits.values()){
            for (CardValue cardValue :  CardValue.values()){
                this.cards.add( new Cards(cardSuits,cardValue));
            }
        }
    }


    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + cards +
                '}';
    }
}
