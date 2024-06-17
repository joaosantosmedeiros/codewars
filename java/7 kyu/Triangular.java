// https://www.codewars.com/kata/525e5a1cb735154b320002c8
import java.util.stream.LongStream;

public class Triangular {
  public static long triangular(long n) {
    return n < 1 ? 0 : LongStream.rangeClosed(1, n).sum();
  }
}