// https://www.codewars.com/kata/563e320cee5dddcf77000158
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class GetAverage {
  public static int getAverage(int[] marks) {
    OptionalDouble avg = IntStream.of(marks).average();

    return avg.isPresent() ? (int) Math.floor(avg.getAsDouble()) : 0;
  }
}