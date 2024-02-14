
// https://www.codewars.com/kata/557b5e0bddf29d861400005d
import java.math.BigDecimal;
import java.math.RoundingMode;

public class MpgToKplConverter {
  public static float mpgToKPM(final float mpg) {
    float convertedValue = (float) (mpg * 1.609344 * 4.54609188);
    return new BigDecimal(convertedValue).setScale(2, RoundingMode.HALF_EVEN).floatValue();
  }
}