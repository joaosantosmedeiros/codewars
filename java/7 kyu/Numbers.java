// https://www.codewars.com/kata/5641c3f809bf31f008000042/train/java
public class Numbers {
  public static Double twoDecimalPlaces(double num) {
    String stringfiedNumber = String.valueOf(num);
    int endIndex = stringfiedNumber.indexOf(".") + 3;
    return Double.parseDouble(stringfiedNumber.substring(0, endIndex));
  }
}