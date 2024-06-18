// https://www.codewars.com/kata/59a8570b570190d313000037/
import java.util.stream.LongStream;

public class SumCubes{
  public static long sumCubes(long n){
    return LongStream.rangeClosed(1, n).map(l -> l*l*l).sum();
  }
}