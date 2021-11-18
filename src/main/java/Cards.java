import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cards {
    private CardSuits cardSuits;
    private CardValue cardValue;



    public Cards(CardSuits cardSuits, CardValue cardValue) {
        this.cardSuits = cardSuits;
        this.cardValue = cardValue;
    }

    public CardSuits getCardSuits() {
        return this.cardSuits;
    }

    public CardValue getCardValue() {
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
