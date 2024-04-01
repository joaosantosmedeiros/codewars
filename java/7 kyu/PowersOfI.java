// https://www.codewars.com/kata/5a97387e5ee396e70a00016d
public class PowersOfI {

  public static String pofi(int n) {
    int index = n % 4;
    if (index == 0) {
      return "1";
    }
    if (index == 1) {
      return "i";
    }
    if (index == 2) {
      return "-1";
    }
    return "-i";
  }

}