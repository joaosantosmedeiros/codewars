public class DivSeven {
  public static long[] seven(long number) {
    long steps = 0;
    while(String.valueOf(number).length() > 2){
      String s = String.valueOf(number);
      int lastDigit = Integer.parseInt(s.substring(s.length() - 1, s.length()));
      number = Long.parseLong(s.substring(0, s.length() - 1)) - 2 * lastDigit;
      steps ++;
    }
    return new long[]{number, steps};
  }
}
