import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Objects;
import org.junit.jupiter.api.Test;

class TestRank {

  @Test
  void testSameRankIsEqual() {
    Rank a = Rank.ACE;
    Rank b = Rank.ACE;

    assertTrue(a.equals(b));
  }

  @Test
  void testLessThan() {
    Rank a = Rank.EIGHT;
    Rank b = Rank.QUEEN;

    assertTrue(a.lessThan(b));
  }

  @Test
  void testToString() {
    Rank a = Rank.JACK;

    assertTrue(Objects.equals(a.toString(), "J"));
  }
}