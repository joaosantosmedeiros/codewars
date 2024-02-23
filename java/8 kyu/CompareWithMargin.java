// https://www.codewars.com/kata/56453a12fcee9a6c4700009c/
public class CompareWithMargin {

  public static int closeCompare(double a, double b) {
    return a - b > 0 ? 1 : a - b < 0 ? -1 : 0;
  }

  public static int closeCompare(double a, double b, double margin) {
    return a - b < -margin ? -1 : a - b > margin ? 1 : 0;
  }
}