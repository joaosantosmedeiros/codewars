// https://codewars.com/kata/5500d54c2ebe0a8e8a0003fd/
public class GCD {
  public static int compute(int x, int y) {
    int smaller = Math.min(x, y);
    for(int i = smaller; i > 1; i -- ){
      if(x % i == 0 && y % i == 0) return i;
    }
    return 1;
  }
}