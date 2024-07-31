//https://www.codewars.com/kata/57aa218e72292d98d500240f

public class HeronFormula {
  public static double heron(double a, double b, double c){
    double s = (a + b + c) / 2d;
    return Math.sqrt(s * (s - a) * (s - b) * (s - c));
  }
}