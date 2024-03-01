// https://www.codewars.com/kata/577a98a6ae28071780000989
import java.util.stream.IntStream;

public class MinAndMax {

  public int min(int[] list) {
    return IntStream.of(list).min().getAsInt();
  }

  public int max(int[] list) {
    return IntStream.of(list).max().getAsInt();
  }
}