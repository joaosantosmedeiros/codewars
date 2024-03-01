// https://www.codewars.com/kata/5a3fe3dde1ce0e8ed6000097
public class FindTheCentury {
  public static int century(int number) {
    return (int) Math.ceil(number / 100d);
  }
}