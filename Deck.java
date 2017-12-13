import java.util.Random;

public class Deck {

  private Card[] deckArr = new Card[52];
  //cards taken off the deck are not actually removed
  //rather size points to the first index after the cards
  //that are still in the deck
  private int size;
  private final Random random = new Random();

  public Deck() {
    int i = 0;
    for (Suit suit : Suit.values()) {
      for (Rank rank : Rank.values()) {
        this.deckArr[i] = new Card(rank, suit);
        i++;
      }
    }
  }

  public Card[] getDeckArr() {
    return deckArr;
  }

  public void shuffleDeck() {
    Card[] sdeck = new Card[getDeckArr().length];

    for (int i = 0; i < getDeckArr().length; i++) {
      int index = random.nextInt(getDeckArr().length);
      sdeck[i] = getDeckArr()[index];
    }
    this.deckArr = sdeck;
  }

  public Card nextCard() {
    Card topCard = getDeckArr()[size];
    if (size < getDeckArr().length) {
      size++;
    } else {
      size = 0;
    }
    return topCard;
  }

  public void printDeck() {
    for (int i = 0; i < deckArr.length; i++) {
      System.out.println(deckArr[i].toString());
    }
  }
}
