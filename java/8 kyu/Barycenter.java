// https://www.codewars.com/kata/5601c5f6ba804403c7000004
import java.text.DecimalFormat;

class Barycenter {

  public static double[] barTriang(double[] x, double[] y, double[] z) {
    DecimalFormat numberFormat = new DecimalFormat("#.0000");

    double x0 = Double.parseDouble(numberFormat.format((x[0] + y[0] + z[0]) / 3));
    double y0 = Double.parseDouble(numberFormat.format((x[1] + y[1] + z[1]) / 3));

    return new double[] { x0, y0 };
  }
}