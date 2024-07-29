// https://www.codewars.com/kata/59cfc09a86a6fdf6df0000f1

public class IndexedCapitalization {
  public static String capitalize(String s, int[] ind) {
    StringBuilder sb = new StringBuilder(s);
    for (int i = 0; i < ind.length; i++) {
      if (sb.length() > ind[i]) {
        sb.setCharAt(ind[i], Character.toUpperCase(sb.charAt(ind[i])));
      }
    }
    return sb.toString();
  }
}