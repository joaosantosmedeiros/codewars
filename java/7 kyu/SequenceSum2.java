// https://www.codewars.com/kata/56e9e4f516bcaa8d4f001763
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SequenceSum2 {

  public static String showSequence(int value) {
    if (value == 0) return "0=0";
    if (value < 0)return value + "<0";
    
    int sum = IntStream.rangeClosed(1, value).sum();
    String numbers = IntStream.rangeClosed(0, value).mapToObj(i -> String.valueOf(i)).collect(Collectors.joining("+"));
    return numbers + " = " + sum;
  }
}