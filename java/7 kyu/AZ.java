// https://www.codewars.com/kata/6512b3775bf8500baea77663
public class AZ {
  public static String gimmeTheLetters(String s) {
    String alphabet = Character.isLowerCase(s.charAt(0)) ? "abcdefghijklmnopqrstuvwxyz" : "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    return alphabet.substring(alphabet.indexOf(s.charAt(0)), alphabet.indexOf(s.charAt(2)) + 1);
  }
}