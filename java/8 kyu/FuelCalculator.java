// https://www.codewars.com/kata/57b58827d2a31c57720012e8
import java.math.BigDecimal;
import java.math.RoundingMode;

public class FuelCalculator {
  public static double fuelPrice(int litres, double pricePerLitre) {
    double discount = litres / 2d >= 5 ? 0.25 : litres / 2 * 0.05;
    double totalPrice = (pricePerLitre - discount) * litres;
    return new BigDecimal(totalPrice).setScale(2, RoundingMode.HALF_EVEN).doubleValue();
  }
}