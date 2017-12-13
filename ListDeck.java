import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListDeck {

  // Fields
  private List<Card> cards = new ArrayList<>();
  // private final Random random = new Random(); -- not needed

  // Constructor
  public ListDeck() {
    for (Suit suit : Suit.values()) {
      for (Rank rank : Rank.values()) {
        cards.add(new Card(rank, suit));
      }
    }
  }

  //Methods
  public Card getCard(int i) {
    return cards.get(i);
  }

  public void shuffleDeck() {
//    for (int i = 0; i < cards.size(); i++) {
//      int index = random.nextInt(cards.size());
//      Collections.swap(cards, i, index);
    Collections.shuffle(this.cards);
  }


  public void removeTopCard() {
    cards.get(0);
    cards.remove(0);
  }

  public void printLDeck() {
    for (Card c : cards) {
      System.out.println(c + ",");
    }
  }
}
