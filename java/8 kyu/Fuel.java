// https://www.codewars.com/kata/5861d28f124b35723e00005e
public class Fuel {

  public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
    return distanceToPump <= mpg * fuelLeft;
  }
}