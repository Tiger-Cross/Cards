import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Objects;
import org.junit.jupiter.api.Test;

public class TestCard {

  @Test
  void testToString() {
    Card aceOfSpades = new Card(Rank.ACE, Suit.SPADES);

    assertTrue(Objects.equals(aceOfSpades.toString(), "A of Spades"));
  }
}
