// https://www.codewars.com/kata/563d59dd8e47a5ed220000ba
public class SumOfDigits {
  public static int sumOfDigits(int n) {
    Integer sum = 0;
    String[] digits = (n + "").split("");
    for (int i = 0; i < digits.length; i++) {
      sum += Integer.parseInt(digits[i]);
    }
    return sum;
  }
}