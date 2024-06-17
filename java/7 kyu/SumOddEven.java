import java.util.stream.IntStream;

public class SumOddEven {
  public static String oddOrEven (int[] array) {
    return IntStream.of(array).sum() % 2 == 0 ? "even" : "odd";
  }
}