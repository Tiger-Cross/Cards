public class Player {

  // Fields
  private final String name;
  private int score;
  Hand hand;

  public Player(String name) {
    this.name = name;
    score = 0;
    hand = new Hand();
  }
}
