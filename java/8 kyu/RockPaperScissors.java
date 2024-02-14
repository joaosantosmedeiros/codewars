// https://www.codewars.com/kata/5672a98bdbdd995fad00000f
public class RockPaperScissors {
  public static String rps(String p1, String p2) {
    if (p1 == "scissors") {
      return p2 == "rock" ? "Player 2 won!" : p2 == "paper" ? "Player 1 won!" : "Draw!";
    }
    if (p1 == "rock") {
      return p2 == "paper" ? "Player 2 won!" : p2 == "scissors" ? "Player 1 won!" : "Draw!";
    }

    return p2 == "scissors" ? "Player 2 won!" : p2 == "rock" ? "Player 1 won!" : "Draw!";
  }
}
