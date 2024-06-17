// https://www.codewars.com/kata/56b7f2f3f18876033f000307
import java.util.Arrays;

public class IsAscOrder {

  public static boolean isAscOrder(int[] arr) {
    int[] arr2 = Arrays.copyOf(arr, arr.length);
    Arrays.sort(arr2);

    return Arrays.equals(arr, arr2);
  }

}
