// https://www.codewars.com/kata/56747fd5cb988479af000028/

public class MiddleCharacter {
  public static String getMiddle(String word) {
    int length = word.length();
    return (length % 2 == 0 ? word.charAt(length / 2 - 1) + "" : "") + word.charAt(length / 2) + "";
  }
}