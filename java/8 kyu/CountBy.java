// https://www.codewars.com/kata/5513795bd3fafb56c200049e/

import java.util.stream.IntStream;

public class CountBy {
  public static int[] countBy(int x, int n) {
    return IntStream.rangeClosed(1, n).map(numb -> numb * x).toArray();
  }
}