// https://www.codewars.com/kata/58b8c94b7df3f116eb00005b
public class ReverseLetters {
  public static String reverseLetter(final String str) {
    return new StringBuilder(str.replaceAll("[^\\w]|[_]|[\\d]", "")).reverse().toString();
  }
}