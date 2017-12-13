import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Objects;
import org.junit.jupiter.api.Test;

public class TestLDeck {

  @Test
  void testLDeck() {
    ListDeck deck = new ListDeck();

    assertTrue(Objects.equals(deck.getCard(0).toString(), "A of Spades"));
  }

  @Test
  void testLDShuffle() {
    ListDeck deck = new ListDeck();

    deck.printLDeck();

    System.out.println();
    System.out.println();

    deck.shuffleDeck();
    deck.printLDeck();
  }

  @Test
  void testLDNextCard() {
    ListDeck deck = new ListDeck();

    deck.removeTopCard();

    assertTrue(deck.getCard(0).toString().equals("2 of Spades"));

    deck.removeTopCard();
    deck.removeTopCard();

    assertTrue(deck.getCard(0).toString().equals("4 of Spades"));

    deck.shuffleDeck();
    System.out.print(deck.getCard(0).toString());

    System.out.println();
    System.out.println();
  }
}
