// https://www.codewars.com/kata/586909e4c66d18dd1800009b
import java.util.Arrays;
import java.util.function.Function;

public class CurryingMultiply {
  public static Function<Integer, int[]> multiplyAll(int[] array) {
    return num -> Arrays.stream(array).map(i -> i * num).toArray();
  }
}