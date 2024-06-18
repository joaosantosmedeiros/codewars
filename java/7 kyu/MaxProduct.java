// https://www.codewars.com/kata/5a4138acf28b82aa43000117
import java.util.stream.IntStream;

public class MaxProduct {
  public int adjacentElementsProduct(int[] array) {
    return IntStream.rangeClosed(0, array.length - 2).map(i -> array[i] * array[i + 1]).max().orElse(0);
  }
}