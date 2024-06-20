// https://www.codewars.com/kata/5d50e3914861a500121e1958/
import java.util.stream.IntStream;

public class AlphabeticalAddiction {
  // Elegant
  public static String addLetters(String... letters) {
    int v = IntStream.range(0, letters.length).map(i -> letters[i].charAt(0)).map(n -> n - 96).sum();
    while(v > 26) v -= 26;

    return v == 0 ? "z" : Character.toString(v + 96);
  }

  // Fast
  public static String addLetters2(String... letters){
    int v = 0;
    if(letters.length == 0) return "z";
    for (String l : letters) {
      v += l.charAt(0) - 96;
    }
    while (v > 26) {
      v -= 26;
    }

    return Character.toString(v + 96);
  }

}