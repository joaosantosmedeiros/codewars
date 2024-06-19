// https://www.codewars.com/kata/555bfd6f9f9f52680f0000c5
public class ReverseNumber {

  public static int reverse(int n) {
    String s = String.valueOf(n);
    StringBuilder sb = new StringBuilder(n < 0 ? s.substring(1, s.length()) : s).reverse();
    return Integer.parseInt((n < 0 ? "-" : "") + sb.toString());
  }
}
