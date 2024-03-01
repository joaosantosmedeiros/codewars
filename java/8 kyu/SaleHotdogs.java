// https://www.codewars.com/kata/57202aefe8d6c514300001fd
public class SaleHotdogs {
  public static int saleHotdogs(final int n) {
    return n < 5 ? n * 100 : n < 10 ? 95 * n : 90 * n;
  }
}