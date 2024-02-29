
// https://www.codewars.com/kata/5a34b80155519e1a00000009
import java.util.ArrayList;
import java.util.List;

public class MultipleOfIndex {
  public static int[] multipleOfIndex(int[] array) {
    List<Integer> list = new ArrayList<Integer>();

    for (int i = 0; i < array.length; i++) {
      if ((i != 0 && array[i] % i == 0) || array[i] == 0) {
        list.add(array[i]);
      }
    }

    return list.stream().mapToInt(i -> i).toArray();
  }
}