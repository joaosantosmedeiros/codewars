// https://www.codewars.com/kata/55f2b110f61eb01779000053
import java.util.stream.IntStream;

public class Sum{
  public int GetSum(int a, int b){
    return IntStream.rangeClosed(a > b ? b : a, b < a ? a : b).sum();
  }
}