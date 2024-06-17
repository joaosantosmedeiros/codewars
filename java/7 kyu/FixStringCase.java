// https://www.codewars.com/kata/5b180e9fedaa564a7000009a
public class FixStringCase {
  public static String solve(final String str) {
    int upper = (int) str.chars().filter(letter -> Character.isUpperCase(letter)).count();
    return upper > str.length() / 2 ? str.toUpperCase() : str.toLowerCase();
  }
}