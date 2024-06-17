// https://www.codewars.com/kata/5467e4d82edf8bbf40000155/
import java.util.List;

public class DescendingOrder {  
  public static int sortDesc(final int num) {
    List<Integer> numbers = String.valueOf(num).chars().map(c -> c - '0').boxed().sorted((a, b) -> b - a).toList();
    System.out.println(numbers);
    StringBuilder sb = new StringBuilder();

    for(int n : numbers){
      sb.append(n);
    }
    return Integer.parseInt(sb.toString());
  }
}