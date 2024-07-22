// https://www.codewars.com/kata/569b5cec755dd3534d00000f
import java.util.stream.DoubleStream;

public class NewAverage{
  public static long newAvg(double[] arr, double navg){
    double sum = DoubleStream.of(arr).sum();
    
    long value = (long) Math.ceil(navg * (arr.length + 1) - sum);
    if(value < 0) throw new IllegalArgumentException();
    
    return value;
  }
}