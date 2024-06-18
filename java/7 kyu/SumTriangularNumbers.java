// https://www.codewars.com/kata/580878d5d27b84b64c000b51
import java.util.stream.IntStream;

public class SumTriangularNumbers{
  public static int sumTriangularNumbers(int n){
    return IntStream.rangeClosed(1, n).map(i -> IntStream.rangeClosed(1, i).sum()).sum();
  }
}