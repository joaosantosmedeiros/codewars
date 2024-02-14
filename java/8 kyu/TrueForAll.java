
// https://codewars.com/kata/54598d1fcbae2ae05200112c
import java.util.function.IntPredicate;

public class TrueForAll {
  public static boolean all(int[] list, IntPredicate predicate) {
    for (int i = 0; i < list.length; i++) {
      if (!predicate.test(list[i])) {
        return false;
      }
    }
    return true;
  }
}