import java.util.Arrays;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class AD2070 {
  public static double[] sensorAnalysis(Object[][] sensor_data) {
    double mean = 0d;
    for (int i = 0; i < sensor_data.length; i++) {
      mean += (double) sensor_data[i][1];
    }
    mean /= sensor_data.length;

    double[] deviation = new double[sensor_data.length];
    for (int i = 0; i < sensor_data.length; i++) {
      deviation[i] = (double) sensor_data[i][1] - mean;
    }

    double standardDeviation = Arrays.stream(deviation).map(num -> num * num).reduce(0d, (a, b) -> a + b)
        / (deviation.length - 1);
    standardDeviation = Math.sqrt(standardDeviation);
    standardDeviation = BigDecimal.valueOf(standardDeviation).setScale(4, RoundingMode.HALF_UP).doubleValue();
    mean = BigDecimal.valueOf(mean).setScale(4, RoundingMode.HALF_UP).doubleValue();

    return new double[] { mean, standardDeviation };
  }
}