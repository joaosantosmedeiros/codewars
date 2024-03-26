// https://www.codewars.com/kata/580755730b5a77650500010c
public class OddEvenSort {
  public static String sortMyString(String s) {
    StringBuilder odd = new StringBuilder();
    StringBuilder even = new StringBuilder();

    for (int i = 0; i < s.length(); i++) {
      if (i % 2 == 0) {
        even.append(s.charAt(i));
      } else {
        odd.append(s.charAt(i));
      }
    }

    return even.toString() + " " + odd.toString();
  }
}