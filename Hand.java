import java.util.ArrayList;
import java.util.List;

public class Hand {

  // Fields
  private List<Card> hand = new ArrayList<>();

  // Constructor
  public Hand() {
    this.hand = hand;
  }

  // Methods
  public void addC(Card card) {
    assert card != null : "cannot have empty cards";
    this.hand.add(card);
  }

  public Card getC(int i) {
    return this.hand.get(i);
  }

  public void clear() {
    this.hand.clear();
  }

  public void remove(int i) {
    this.hand.remove(i);
  }

  public void removeC(Card c) {
    this.hand.remove(c);
  }

  public int getCardCount() {
    return this.hand.size();
  }

  public void sortBySuit() {
    //for (int i = 0; i < this.hand.size(); i++) {
    //this.hand.sort(comparator);
    //}
    List<Card> newHand = new ArrayList<Card>();
    while (hand.size() > 0) {
      int pos = 0;  // Position of minimal card.
      Card c = hand.get(0);  // Minimal card.
      for (int i = 1; i < hand.size(); i++) {
        Card c1 = hand.get(i);
        if (c1.getSuit().lessThan(c.getSuit()) ||
            (c1.getSuit().equals(c.getSuit())
                && c1.getRank().lessThan(c.getRank()))) {
          pos = i;
          c = c1;
        }
      }
      hand.remove(pos);
      newHand.add(c);
    }
    hand = newHand;
  }

  public void sortByValue() {
    List<Card> newHand = new ArrayList<Card>();
    while (hand.size() > 0) {
      int pos = 0;  // Position of minimal card.
      Card c = hand.get(0);  // Minimal card.
      for (int i = 1; i < hand.size(); i++) {
        Card c1 = hand.get(i);
        if (c1.getRank().lessThan(c.getRank()) ||
            (c1.getRank().equals(c.getRank())
                && c1.getSuit().lessThan(c.getSuit()))) {
          pos = i;
          c = c1;
        }
      }
      hand.remove(pos);
      newHand.add(c);
    }
    hand = newHand;
  }

  public String printHand() {
    return this.hand.toString();
  }
}
