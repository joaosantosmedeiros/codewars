
// https://www.codewars.com/kata/545afd0761aa4c3055001386
import java.util.Arrays;

public class EnumerableMagic25 {
  public static int[] take(int[] arr, int n) {
    if (arr.length == 0 || arr == null) {
      return new int[] {};
    }

    n = n > arr.length ? arr.length : n;

    return Arrays.copyOfRange(arr, 0, n);
  }
}
