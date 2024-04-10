// https://www.codewars.com/kata/5d5f5ea8e3d37b001dfd630a
import java.util.stream.IntStream;

public class HistogramH2 {

  public static String histogram(final int results[]) {
    double sum = IntStream.of(results).sum();
    StringBuilder sb = new StringBuilder();
    
    for(int i = results.length - 1; i >= 0; i --) {
      int percentage = (int) ((results[i] / sum) * 100);
      sb.append((i + 1) + "|" + "█".repeat(percentage / 2) + (percentage > 0 ? " " + percentage + "%" : "") + "\n");
    }
    
    return sb.toString();
  }
  
}
