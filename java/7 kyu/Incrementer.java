// https://www.codewars.com/kata/590e03aef55cab099a0002e8
import java.util.stream.IntStream;

public class Incrementer {

  public static int[] incrementer(int[] numbers) {
    return IntStream.range(0, numbers.length).map(i -> {
      String s = String.valueOf(i + ++numbers[i]);
      return Integer.parseInt(s.substring(s.length() - 1, s.length()));
    }).toArray();
  }
}