// https://www.codewars.com/kata/5a34af40e1ce0eb1f5000036
public class ArrayToCSV {
  public static String toCsvText(int[][] array) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        sb.append(array[i][j] + ",");
      }
      sb = new StringBuilder(sb.substring(0, sb.length() - 1));
      sb.append("\n");
    }
    return sb.substring(0, sb.length() - 1);
  }
}