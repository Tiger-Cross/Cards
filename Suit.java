
public enum Suit {

  SPADES("Spades"),
  HEARTS("Hearts"),
  CLUBS("Clubs"),
  DIAMONDS("Diamonds");

  private final String suit;

  Suit (String suit) {this.suit = suit;}

  public String toString() {
    return suit;
  }

  public boolean sameSuit(Suit suit) {
    return this.ordinal() == suit.ordinal();
  }

  public boolean lessThan(Suit suit) {
    return this.ordinal() < suit.ordinal();
  }
}
