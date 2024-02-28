// https://www.codewars.com/kata/570a6a46455d08ff8d001002
public class NoBoring {
  public static int noBoringZeros(int n) {
    while (n % 10 == 0 && n != 0) {
      n /= 10;
    }
    return n;
  }
}