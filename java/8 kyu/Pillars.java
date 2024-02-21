// https://www.codewars.com/kata/5bb0c58f484fcd170700063d
public class Pillars {

  public static int pillars(int numPill, int dist, int width) {
    return numPill <= 1 ? 0 : (numPill - 1) * dist * 100 + (numPill - 2) * width;
  }

}