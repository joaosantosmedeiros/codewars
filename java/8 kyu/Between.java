// https://www.codewars.com/kata/55ecd718f46fba02e5000029
import java.util.stream.IntStream;

public class Between {

  public static int[] between(int a, int b) {
    return IntStream.rangeClosed(a, b).toArray();
  }
}