// https://www.codewars.com/kata/65ba420888906c1f86e1e680/train/java
public class Collinearity {
  public static boolean collinearity(int x1, int y1, int x2, int y2) {
    boolean zero = (x1 == y1 && x1 == 0) || (x2 == y2 && x2 == 0);
    return (float) x1 / (float) y1 == (float) x2 / (float) y2 || zero;
  }
}