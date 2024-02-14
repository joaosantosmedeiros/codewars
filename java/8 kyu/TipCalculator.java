// https://www.codewars.com/kata/56598d8076ee7a0759000087/train/java
public class TipCalculator {

  public static Integer calculateTip(double amount, String rating) {
    int tip = -1;
    if (rating.equalsIgnoreCase("terrible")) {
      tip = 0;
    }
    if (rating.equalsIgnoreCase("poor")) {
      tip = 5;
    }
    if (rating.equalsIgnoreCase("good")) {
      tip = 10;
    }
    if (rating.equalsIgnoreCase("great")) {
      tip = 15;
    }
    if (rating.equalsIgnoreCase("excellent")) {
      tip = 20;
    }

    return tip == -1 ? null : (int) Math.ceil(amount * tip / 100);
  }
}