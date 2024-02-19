// https://www.codewars.com/kata/5a805d8cafa10f8b930005ba
public class CodeWarsMath {
  public static int nearestSq(final int n) {
    int sqrt = (int) Math.sqrt(n);
    int nextRoot = (int) Math.pow(sqrt + 1, 2);
    int previousRoot = (int) Math.pow(sqrt, 2);

    return Math.abs(nextRoot - n) > Math.abs(previousRoot - n) ? previousRoot : nextRoot;
  }
}