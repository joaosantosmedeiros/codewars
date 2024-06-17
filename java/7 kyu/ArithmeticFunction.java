// https://www.codewars.com/kata/583f158ea20cfcbeb400000a
public class ArithmeticFunction {
  public static int arithmetic(int a, int b, String operator) {
    return operator == "add" ? a + b : operator == "subtract" ? a - b : operator == "divide" ? a / b : a * b;
  }
}