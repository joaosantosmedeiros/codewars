// https://www.codewars.com/kata/54fb963d3fe32351f2000102
public class Collatz {
  public static long conjecture(long x) {
    if(x == 1) return 1;
    return 1 + conjecture(x % 2 == 0 ? x / 2 : x * 3 + 1);
  }
}