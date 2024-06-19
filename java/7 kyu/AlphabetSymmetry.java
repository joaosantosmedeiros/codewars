// https://www.codewars.com/kata/59d9ff9f7905dfeed50000b0
import java.util.stream.IntStream;

public class AlphabetSymmetry {
  public static int[] solve(String[] arr) {
    int[] alphabet = IntStream.range(0, 26).map(i -> (i + 97)).toArray();
    int[] values = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      String word = arr[i].toLowerCase();
      values[i] = (int) IntStream.range(0, arr[i].length()).filter(j -> word.charAt(j) == alphabet[(j >= alphabet.length ? 25 : j)]).count();
    }
    return values;
  }
}