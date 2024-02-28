// https://www.codewars.com/kata/577a6e90d48e51c55e000217
public class CollatzConjecture {
  public static int hotpo(int n) {
    int count = 0;
    for (int i = 0; n > 1; i++) {
      n = n % 2 == 0 ? n / 2 : 3 * n + 1;
      count++;
    }
    return count;
  }
}