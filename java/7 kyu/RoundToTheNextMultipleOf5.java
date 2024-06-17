// https://www.codewars.com/kata/55d1d6d5955ec6365400006d
public class RoundToTheNextMultipleOf5 {

  public static int roundToNext5(int number) {
    if(number % 5 == 0) return number;
    return number + ((number > 0 ? 5 : 0) - number % 5);
  }
}
