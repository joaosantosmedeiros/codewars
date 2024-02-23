// https://www.codewars.com/kata/5b73fe9fb3d9776fbf00009e
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfDifferences {
  public static int sumOfDifferences(int[] arr) {
    List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
    list.sort((a, b) -> b - a);

    int sum = 0;
    for (int i = 0; i < list.size() - 1; i++) {
      sum += list.get(i) - list.get(i + 1);
    }

    return arr == null || arr.length < 2 ? 0 : sum;
  }
}