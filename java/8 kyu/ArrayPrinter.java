// https://www.codewars.com/kata/56e2f59fb2ed128081001328
public class ArrayPrinter {

  public static String printArray(Object[] array) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < array.length; i++) {
      sb.append(array[i] + ",");
    }
    return sb.substring(0, sb.length() - 1);
  }
}