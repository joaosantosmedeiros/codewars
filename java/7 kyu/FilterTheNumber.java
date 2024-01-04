// https://www.codewars.com/kata/55b051fac50a3292a9000025/train/java
public class FilterTheNumber {
  public static long filterString(final String value) {
    String s = "";
    for (int i = 0; i < value.length(); i++) {
      if (value.codePointAt(i) >= 48 && value.codePointAt(i) <= 57) {
        s += value.charAt(i);
      }
    }
    return Long.parseLong(s);
  }
}