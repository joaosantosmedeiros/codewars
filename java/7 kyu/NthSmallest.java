// https://www.codewars.com/kata/5a512f6a80eba857280000fc
import java.util.Arrays;

public class NthSmallest {
  public static int nthSmallest(final int[] arr, final int n) {
    Arrays.sort(arr);
    return arr[n - 1]; 
  }
}