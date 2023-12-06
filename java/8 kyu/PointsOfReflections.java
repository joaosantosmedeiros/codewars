// https://www.codewars.com/kata/57bfea4cb19505912900012c/train/java
public class PointsOfReflections {
  public static int[] reflectPoint(int[] p, int[] q) {
    int x = q[0]*2 - p[0];
    int y = q[1]*2 - p[1];
    int[] r = {x, y};
    
    return r;
  }
  
}