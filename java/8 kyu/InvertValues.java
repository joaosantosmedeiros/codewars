// https://www.codewars.com/kata/5899dc03bc95b1bf1b0000ad/train/java
import java.util.Arrays;

public class InvertValues {
  public static int[] invert(int[] array) {
    return Arrays.stream(array).map(number -> number = number / -1).toArray();
  }
}