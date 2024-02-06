// https://www.codewars.com/kata/59f11118a5e129e591000134/train/java  
import java.util.Arrays;

class SumOfSingles {
  public static int repeats(int[] arr) {
    int sum = 0;

    int[] sortedArr = Arrays.stream(arr).sorted().toArray();
    for (int i = 0; i < sortedArr.length; i++) {
      if (i == 0) {
        if (sortedArr[1] != sortedArr[0]) {
          sum += sortedArr[0];
        }
      } else if (i == sortedArr.length - 1) {
        if (sortedArr[sortedArr.length - 1] != sortedArr[sortedArr.length - 2]) {
          sum += sortedArr[sortedArr.length - 1];
        }
      } else {
        if (sortedArr[i] != sortedArr[i - 1] && sortedArr[i] != sortedArr[i + 1]) {
          sum += sortedArr[i];
        }
      }
    }

    return sum;
  }
}