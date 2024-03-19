// https://www.codewars.com/kata/56269eb78ad2e4ced1000013
public class NumberFun {
  public static long findNextSquare(long sq) {
    long square = (long) Math.sqrt(sq);
    if (square * square != sq) {
      return -1;
    }

    return ++square * square;
  }
}