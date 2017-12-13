import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Objects;
import org.junit.jupiter.api.Test;

public class TestHand {

  Card c1 = new Card(Rank.ACE, Suit.SPADES);
  Card c2 = new Card(Rank.KING, Suit.DIAMONDS);
  Card c3 = new Card(Rank.ACE, Suit.DIAMONDS);
  Card c4 = new Card(Rank.FIVE, Suit.HEARTS);
  Card c5 = new Card(Rank.JACK, Suit.SPADES);
  Card c6 = new Card(Rank.SEVEN, Suit.CLUBS);
  Hand hand = new Hand();


  @Test
  void testAdd() {

    hand.addC(c1);

    assertTrue(Objects.equals(hand.printHand(), "[A of Spades]"));

    hand.addC(c2);
    hand.addC(c3);

    assertTrue(Objects.equals(hand.printHand(), "[A of Spades, K of "
        + "Diamonds, A of Diamonds]"));
  }

  @Test
  void testGetC() {

    hand.addC(c1);
    hand.addC(c2);
    hand.addC(c3);

    assertTrue(Objects.equals(hand.getC(0).toString(), "A of Spades"));
    assertTrue(Objects.equals(hand.getC(1).toString(), "K of Diamonds"));
    assertTrue(Objects.equals(hand.getC(2).toString(), "A of Diamonds"));

  }

  @Test
  void testRemC() {
    hand.addC(c1);
    hand.addC(c2);
    hand.addC(c3);
    hand.addC(c4);
    hand.addC(c5);
    hand.addC(c6);

    assertTrue(Objects.equals(hand.printHand(), "[A of Spades, K of "
        + "Diamonds, A of Diamonds, 5 of Hearts, J of Spades, 7 of Clubs]"));

    hand.remove(3);

    assertTrue(Objects.equals(hand.printHand(), "[A of Spades, K of "
        + "Diamonds, A of Diamonds, J of Spades, 7 of Clubs]"));

    hand.remove(3);

    assertTrue(Objects.equals(hand.printHand(), "[A of Spades, K of "
        + "Diamonds, A of Diamonds, 7 of Clubs]"));

    hand.remove(0);

    assertTrue(Objects.equals(hand.printHand(), "[K of "
        + "Diamonds, A of Diamonds, 7 of Clubs]"));
  }

  @Test
  void testGetCardCount() {

    assertTrue(hand.getCardCount() == 0);

    hand.addC(c1);
    hand.addC(c2);
    hand.addC(c3);

    assertTrue(hand.getCardCount() == 3);

    hand.addC(c4);
    hand.addC(c6);

    assertTrue(hand.getCardCount() == 5);

    hand.remove(0);
    hand.remove(3);
    hand.remove(1);

    assertTrue(hand.getCardCount() == 2);

  }

  @Test
  void testRemoveAll() {
    hand.clear();

    assertTrue(Objects.equals(hand.printHand(), "[]"));
  }

  @Test
  void testSortBySuit() {
    hand.addC(c1);
    hand.addC(c2);
    hand.addC(c3);
    hand.addC(c4);
    hand.addC(c5);
    hand.addC(c6);

    System.out.println(hand.printHand());

    hand.sortBySuit();

    System.out.println(hand.printHand());

    System.out.println();
  }

  @Test
  void testSortByValue() {
    hand.addC(c1);
    hand.addC(c2);
    hand.addC(c3);
    hand.addC(c4);
    hand.addC(c5);
    hand.addC(c6);

    System.out.println(hand.printHand());

    hand.sortByValue();

    System.out.println(hand.printHand());
  }
}
