//https://www.codewars.com/kata/65126d52a5de2b11c94096d2
import java.util.stream.IntStream;

public class ClosingInSum {
	public static int closingInSum(long n) {
    String[] s = String.valueOf(n).split("");
    int ceil = (int) Math.ceil(s.length / 2d);
    return IntStream.range(0, ceil)
      .map(i -> i == (ceil - 1) && (s.length % 2 != 0) ? Integer.parseInt(s[i]) : Integer.parseInt(s[i] + s[s.length - i - 1]))
      .sum();
	}
}