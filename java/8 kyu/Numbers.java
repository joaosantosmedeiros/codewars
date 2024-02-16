// https://www.codewars.com/kata/5641a03210e973055a00000d
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Numbers
{
  public static double TwoDecimalPlaces(double number)
  {
    return new BigDecimal(number).setScale(2, RoundingMode.HALF_UP).doubleValue();
  }
}