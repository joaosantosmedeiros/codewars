// https://www.codewars.com/kata/53d32bea2f2a21f666000256/
import java.util.Arrays;

public class LargestElements {

  public static int[] largest(int n, int[] arr) {
    Arrays.sort(arr);
    return Arrays.copyOfRange(arr, arr.length - n, arr.length);
  }
}