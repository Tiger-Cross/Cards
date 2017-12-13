import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Objects;
import org.junit.jupiter.api.Test;

public class TestSuit {

  @Test
  void testToString() {
    Suit spades = Suit.SPADES;

    assertTrue(Objects.equals(spades.toString(), "Spades"));
  }

  @Test
  void testSameSuit() {
    Suit D1 = Suit.DIAMONDS;
    Suit D2 = Suit.DIAMONDS;

    assertTrue(D2.sameSuit(D1));
  }
}
