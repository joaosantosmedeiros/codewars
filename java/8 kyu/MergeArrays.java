
// https://www.codewars.com/kata/573f5c61e7752709df0005d2
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergeArrays {
  public static int[] mergeArrays(int[] first, int[] second) {
    List<Integer> mergedList = Arrays.stream(first).boxed().collect(Collectors.toList());
    mergedList.addAll(Arrays.stream(second).boxed().collect(Collectors.toList()));
    return mergedList.stream().distinct().sorted().mapToInt(i -> i).toArray();
  }
}
