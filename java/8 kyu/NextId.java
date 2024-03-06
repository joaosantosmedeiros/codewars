import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NextId {
  public static int nextId(int[] ids) {
    if (ids.length == 0)
      return 0;

    List<Integer> idsList = Arrays.stream(ids).distinct().sorted().boxed().collect(Collectors.toList());
    int[] rangeArr = IntStream.rangeClosed(0, idsList.get(idsList.size() - 1)).toArray();
    int minId = idsList.get(idsList.size() - 1) + 1;

    for (int number : rangeArr) {
      if (idsList.indexOf(number) == -1) {
        minId = number;
        break;
      }
    }

    return minId;
  }
}