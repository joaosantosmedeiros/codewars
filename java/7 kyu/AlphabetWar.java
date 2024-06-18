// https://www.codewars.com/kata/59377c53e66267c8f6000027
import java.util.Arrays;

public class AlphabetWar {
  public static String alphabetWar(String fight) {
    String[] leftLetters = fight.trim().replaceAll("[^wpbs]", "").split("");
    String[] rightLetters = fight.trim().replaceAll("[^mqdz]", "").split("");

    int left = Arrays.stream(leftLetters).mapToInt(l -> l.equals("w") ? 4 : l.equals("p") ? 3 : l.equals("b") ? 2 : l.equals("s") ? 1 : 0).sum();
    int right = Arrays.stream(rightLetters).mapToInt(l -> l.equals("m") ? 4 : l.equals("q") ? 3 : l.equals("d") ? 2 : l.equals("z") ? 1 : 0).sum();

    return left == right ? "Let's fight again!" : left < right ? "Right side wins!" : "Left side wins!";
  }
}