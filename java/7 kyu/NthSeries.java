// https://www.codewars.com/kata/555eded1ad94b00403000071/train/java
public class NthSeries {

  public static String seriesSum(int n) {
    double v = 0;
    for (int i = 0; i < n; i++) {
      v += 1 / (3f * i + 1);
    }
    return String.format("%.2f", v);
  }
}