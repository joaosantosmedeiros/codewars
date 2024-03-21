
// https://www.codewars.com/kata/592edfda5be407b9640000b2
import java.util.Arrays;

public class DigitalCypher2 {
  public static String decode(int[] code, int key) {
    String[] alphabet = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
        "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
    int[] keySplitted = Arrays.stream(String.valueOf(key).split("")).mapToInt(i -> Integer.parseInt(i)).toArray();

    for (int i = 0; i < code.length; i++) {
      code[i] -= keySplitted[i % keySplitted.length];
    }

    String[] codeMapped = Arrays.stream(code).mapToObj(number -> alphabet[number - 1].toString())
        .toArray(String[]::new);

    return String.join("", codeMapped);
  }
}
