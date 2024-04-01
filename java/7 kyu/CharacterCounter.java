// https://www.codewars.com/kata/56786a687e9a88d1cf00005d
import java.util.Arrays;

public class CharacterCounter {

  public static boolean validateWord(String word) {
    String[] letters = word.toLowerCase().split("");
    long count = Arrays.stream(letters).filter(letter -> letter.equals(letters[0])).count();

    for (int i = 1; i < letters.length; i++) {
      final int index = i;
      if (count != Arrays.stream(letters).filter(letter -> letter.equals(letters[index])).count()) {
        return false;
      }
    }
    return true;
  }
}