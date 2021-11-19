import java.util.*;
import java.util.stream.Collectors;

public class Deck {

    private ArrayList<Cards> cards;
    ArrayList<Cards> userCard = new ArrayList<>();


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

        } return cards;
    }

    public ArrayList<Cards> shuffleCard(){
        Collections.shuffle(cards);
        return cards;
    }


    public ArrayList<Cards> getTwoCard(){
    for(int i=0;i<2;i++){
        Cards getCard = cards.get(i);
        userCard.add(getCard);
        cards.remove(i);

    }
    return userCard;

    }

    public ArrayList<Cards>  getOneCard(){
        userCard.add( cards.remove(0));
        return userCard;
    }

    public Integer getTotalUserCardsValue(){
        List<Integer> collect = userCard.stream().map(x -> x.getCardValue()).collect(Collectors.toList());
       return collect.stream().reduce(0, Integer::sum);
    }

//    public void checkValueOfPlayerCard(){
//        for()
//    }

    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + cards +
                '}';
    }
}


/*  if (getTotalUserCardsValue() < 17){
            System.out.println("get dealt another cards from the top");

            getOneCard();
            System.out.println(userCard);
            System.out.println(getTotalUserCardsValue());

        }else if (getTotalUserCardsValue() >= 17 && getTotalUserCardsValue() <= 21 ){
            System.out.println(" id don't get dealt another cards");
        }else if (getTotalUserCardsValue() > 21){
            System.out.println("you are out of the game!");
//        }*/