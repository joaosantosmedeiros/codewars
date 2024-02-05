
// https://www.codewars.com/kata/5a8bcd980025e99381000099/train/java
import java.util.ArrayList;

public class SquareUp {
  public static int[] squareUp(int n) {
    var numbersList = new ArrayList<Integer>();
    for (int i = 0; i < n; i++) {
      for (int j = n; j > 0; j--) {
        numbersList.add(j);
      }
    }

    var i = n - 1;
    for (int j = 0; j < n - 1; j++) {
      for (int k = 0; k < i; k++) {
        if (j == 0) {
          numbersList.set(k, 0);
        } else {
          numbersList.set(j * n + k, 0);
        }
      }
      i--;
    }

    return numbersList.stream().mapToInt(Integer::intValue).toArray();
  }
}
