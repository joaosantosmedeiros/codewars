// https://www.codewars.com/kata/5168bb5dfe9a00b126000018
public class ReverseString {

  public static String solution(String str) {
    StringBuilder sb = new StringBuilder(str);
    for (int i = 0; i < sb.length() / 2; i++) {
      char actualChar = sb.charAt(i);
      sb.setCharAt(i, sb.charAt(sb.length() - 1 - i));
      sb.setCharAt(sb.length() - 1 - i, actualChar);
    }
    return sb.toString();
  }

}