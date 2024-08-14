// https://www.codewars.com/kata/5a092d9e46d843b9db000064
import java.util.Arrays;
import java.util.List;

public class ArrayElementParity {
  public static int solve(int[] arr) {
    List<Integer> positives = Arrays.stream(arr).filter(n -> n >= 0).boxed().toList();
    List<Integer> negatives = Arrays.stream(arr).filter(n -> n < 0).boxed().toList();
    
    for(Integer i : positives) {
      if(negatives.indexOf(-i) == -1) return i;
    }
    for(Integer j : negatives) {
      if(positives.indexOf(-j) == -1) return j;
    }
    
    return 0;
  }
}