import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> player;
    private Deck deck;

    public Game(List<Player> player, Deck deck) {
        this.player = player;
        this.deck = deck;
    }


    @Override
    public String toString() {
        return "Game{" +
                "player=" + player +
                ", deck=" + deck +
                '}';
    }
}
