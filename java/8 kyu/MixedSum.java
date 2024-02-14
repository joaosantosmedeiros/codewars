// https://www.codewars.com/kata/57eaeb9578748ff92a000009
import java.util.List;

public class MixedSum {

  public int sum(List<?> mixed) {
    int sum = 0;
    for (int i = 0; i < mixed.size(); i++) {
      sum += Integer.parseInt(String.valueOf(mixed.get(i)));
    }
    return sum;
  }
}