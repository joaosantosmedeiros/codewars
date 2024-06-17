// https://www.codewars.com/kata/566fc12495810954b1000030
import java.util.stream.IntStream;

public class CountDig {
  public static int nbDig(int n, int d) {
    return IntStream.rangeClosed(0, n).map(x -> String.valueOf(x * x).replaceAll(String.format("[^%d]",d), "").length()).sum();
  }
}