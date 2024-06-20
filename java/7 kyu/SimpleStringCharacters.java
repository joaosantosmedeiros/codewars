// https://www.codewars.com/kata/5a29a0898f27f2d9c9000058
public class SimpleStringCharacters {

  public static int[] Solve(String word) {
    System.out.println();
    int upperCase = word.length() - word.replaceAll("[A-Z]", "").length();
    int lowerCase = word.length() - word.replaceAll("[a-z]", "").length();
    int digits = word.length() - word.replaceAll("[0-9]", "").length();
    int special = word.length() - upperCase - lowerCase - digits;
    return new int[] { upperCase, lowerCase, digits, special };
  }
}