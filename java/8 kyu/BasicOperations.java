// https://www.codewars.com/kata/57356c55867b9b7a60000bd7
public class BasicOperations {
  public static Integer basicMath(String op, int v1, int v2) {
    if (op == "+") {
      return v1 + v2;
    }
    if (op == "-") {
      return v1 - v2;
    }
    if (op == "*") {
      return v1 * v2;
    }
    return v1 / v2;
  }
}