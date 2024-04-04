import java.math.BigDecimal;
import java.math.RoundingMode;

public class MapVector {

  public static double[] mapVector(double[] vector, double[] circle1, double[] circle2) {
    var vectorX = (vector[0] - circle1[0]);
    var vectorY = (vector[1] - circle1[1]);

    var newX = circle2[0] + (vectorX * circle2[2]) / circle1[2];
    var newY = circle2[1] + (vectorY * circle2[2]) / circle1[2];

    newX = BigDecimal.valueOf(newX).setScale(2, RoundingMode.HALF_EVEN).doubleValue();
    newY = BigDecimal.valueOf(newY).setScale(2, RoundingMode.HALF_EVEN).doubleValue();

    return new double[] { newX, newY };
  }
}