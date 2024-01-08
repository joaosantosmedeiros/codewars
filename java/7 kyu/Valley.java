// https://www.codewars.com/kata/56e3cd1d93c3d940e50006a4/train/java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Valley {
  public static int[] makeValley(int[] arr) {
    if (arr.length == 0) {
      return new int[] {};
    }

    List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
    Collections.sort(list, Collections.reverseOrder());

    int minValue = Collections.min(list);
    int minValueIndex = 0;
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) == minValue) {
        minValueIndex = i;
      }
    }

    list.remove(minValueIndex);

    List<Integer> leftWing = new ArrayList<Integer>();
    List<Integer> rightWing = new ArrayList<Integer>();
    for (int i = 0; i < list.size(); i++) {
      if (i % 2 == 0) {
        leftWing.add(list.get(i));
      } else {
        rightWing.add(list.get(i));
      }
    }

    Collections.sort(rightWing);
    rightWing.add(0, minValue);

    leftWing.addAll(rightWing);
    return leftWing.stream().mapToInt(Integer::intValue).toArray();
  }
}
