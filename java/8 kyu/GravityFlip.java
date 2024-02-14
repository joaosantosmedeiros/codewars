// https://www.codewars.com/kata/5f70c883e10f9e0001c89673
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class GravityFlip {
  public static int[] flip(char dir, int[] arr) {
    List<Integer> list = new ArrayList<Integer>(Arrays.stream(arr).sorted().boxed().toList());
    if (dir == 'L') {
      list.sort(Comparator.reverseOrder());
    }
    return list.stream().mapToInt(i -> i).toArray();
  }
}