// https://www.codewars.com/kata/55a75e2d0803fea18f00009d
public class Slope {

  public String slope(int[] points) {
    if (points[0] - points[2] == 0) {
      return "undefined";
    }

    return "" + (points[1] - points[3]) / (points[0] - points[2]);
  }

}