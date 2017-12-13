import java.util.Comparator;

public class Card {

  private Rank rank;
  private Suit suit;

  public Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public Rank getRank() {
    return rank;
  }

  public Suit getSuit() {
    return suit;
  }

  /*
  public static Comparator<Suit> suitComparator = new Comparator<Suit>() {
    public int compare(Suit suit1, Suit suit2) {
      return suit1.compareTo(suit2);
    }
  };
  */

  public String toString() {
    return rank.toString() + " of " + suit.toString();
  }

}
