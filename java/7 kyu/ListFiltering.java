
// https://www.codewars.com/kata/53dbd5315a3c69eed20002dd
import java.util.List;

public class ListFiltering {
  public static List<Object> filterList(final List<Object> list) {
    return list.stream().filter(obj -> obj instanceof Integer).toList();
  }
}
