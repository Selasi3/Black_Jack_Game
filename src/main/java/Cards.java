import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cards {
    private CardSuits cardSuits;
    private int cardValue;



    public Cards(CardSuits cardSuits, int cardValue) {
        this.cardSuits = cardSuits;
        this.cardValue = cardValue;
    }

    public CardSuits getCardSuits() {
        return this.cardSuits;
    }

    public Integer getCardValue() {
        return this.cardValue;
    }



    @Override
    public String toString() {
        return "Cards{" +
                "cardSuits=" + cardSuits +
                ", cardValue=" + cardValue +
                '}';
    }
}
