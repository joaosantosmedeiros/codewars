// https://www.codewars.com/kata/588a3c3ef0fbc9c8e1000095
import java.util.Arrays;

public class MaxDifferenceInArrays {

  public static int maxDiff(int[] lst) {
    Arrays.sort(lst);
    return lst.length == 0 ? 0 : lst[lst.length - 1] - lst[0];
  }
}