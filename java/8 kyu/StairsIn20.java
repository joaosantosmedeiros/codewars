// https://www.codewars.com/kata/56fc55cd1f5a93d68a001d4e
import java.util.Arrays;

public class StairsIn20 {
  public static long stairsIn20(int[][] stairs) {
    int sum = 0;
    for (int i = 0; i < stairs.length; i++) {
      sum += Arrays.stream(stairs[i]).sum();
    }

    return sum * 20;
  }
}