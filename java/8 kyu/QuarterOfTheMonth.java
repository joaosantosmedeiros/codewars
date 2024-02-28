// https://www.codewars.com/kata/5ce9c1000bab0b001134f5af
public class QuarterOfTheMonth {
  public static int quarterOf(int month) {
    return month % 3 == 0 ? month / 3 : month / 3 + 1;
  }
}