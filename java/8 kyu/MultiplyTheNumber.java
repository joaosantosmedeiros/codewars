// https://www.codewars.com/kata/5708f682c69b48047b000e07
public class MultiplyTheNumber {
  public static int multiply(int number) {
    return number * (int) Math.pow(5, String.valueOf(number).replace("-", "").length());
  }
}