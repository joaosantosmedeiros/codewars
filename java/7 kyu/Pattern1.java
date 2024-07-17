// https://www.codewars.com/kata/5572f7c346eb58ae9c000047
public class Pattern1{
  public static String pattern(int n){
    StringBuilder sb = new StringBuilder();
    for(int i = 1; i <= n; i ++) {
      sb.append((i + "").repeat(i) + "\n");
    }
    return n < 1 ? "" : sb.toString().substring(0, sb.length() - 1);
  }
}