
// https://www.codewars.com/kata/5769b3802ae6f8e4890009d2
import java.util.ArrayList;
import java.util.List;

public class RemoveEveryOther {

  public static Object[] removeEveryOther(Object[] arr) {
    List<Object> list = new ArrayList<Object>();

    for (int i = 0; i < arr.length; i++) {
      if (i % 2 == 0) {
        list.add(arr[i]);
      }
    }

    return list.toArray();
  }
}