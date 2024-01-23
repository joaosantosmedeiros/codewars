// https://www.codewars.com/kata/54557d61126a00423b000a45/train/java
public class ReverseLonger {
  public static String shorterReverseLonger(String a, String b) {
    if (a.length() >= b.length()) {
      String reversedString = new StringBuilder().append(a).reverse().toString();
      return b + reversedString + b;
    }
    String reversedString = new StringBuilder().append(b).reverse().toString();
    return a + reversedString + a;
  }
}