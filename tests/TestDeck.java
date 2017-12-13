import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Objects;
import org.junit.jupiter.api.Test;

public class TestDeck {

  @Test
  void testDeck() {
    Deck deck = new Deck();

    assertTrue(Objects.equals(deck.getDeckArr()[0].toString(), "A of "
        + "Spades"));
    assertTrue(Objects.equals(deck.getDeckArr()[1].toString(), "2 of "
        + "Spades"));
    assertTrue(Objects.equals(deck.getDeckArr()[51].toString(), "K "
        + "of Diamonds"));
  }

  @Test
  void testShuffle() {
    Deck deck = new Deck();
    deck.shuffleDeck();
  }

  @Test
  void testNextCard() {
    Deck deck = new Deck();
    assertTrue(deck.nextCard().toString().equals("A of Spades"));
    deck.nextCard();
    deck.nextCard();
    assertTrue(deck.nextCard().toString().equals("4 of Spades"));
  }

  @Test
  void testPrint() {
    Deck deck = new Deck();
    deck.shuffleDeck();
    deck.printDeck();
  }
}

