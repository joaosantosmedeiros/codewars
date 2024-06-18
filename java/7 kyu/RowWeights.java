// https://www.codewars.com/kata/5abd66a5ccfd1130b30000a9
public class RowWeights {
  public static int[] rowWeights(final int[] weights) {
    int row1 = 0;
    int row2 = 0;
    for (int i = 0; i < weights.length; i++) {
      if (i % 2 == 0) {
        row1 += weights[i];
      } else {
        row2 += weights[i];
      }
    }
    return new int[] { row1, row2 };
  }
}