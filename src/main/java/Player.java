import java.util.ArrayList;

public class Player {

    private String name;
    ArrayList<Integer> playerValue;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getPlayerValue() {
        return playerValue;
    }



    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", playerValue=" + playerValue +
                '}';
    }

}
