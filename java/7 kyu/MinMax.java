// https://www.codewars.com/kata/559590633066759614000063
import java.util.stream.IntStream;

public class MinMax {
  public static int[] minMax(int[] arr) {
    int min = IntStream.of(arr).min().orElse(0);
    int max = IntStream.of(arr).max().orElse(0);
    return new int[]{min, max};
  }
}