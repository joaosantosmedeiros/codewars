// https://www.codewars.com/kata/56b1f01c247c01db92000076
public class DoubleChar {
  public static String doubleChar(String s) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      sb.append(s.charAt(i) + "" + s.charAt(i));
    }

    return sb.toString();
  }
}