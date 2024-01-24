// https://www.codewars.com/kata/5bbb8887484fcd36fb0020ca/train/java
public class PlusMinusPlus {
  public static int signChange(int[] arr) {
    int count = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] >= 0) {
        if (arr[i + 1] < 0) {
          count++;
        }
      } else {
        if (arr[i + 1] >= 0) {
          count++;
        }
      }
    }
    return count;
  }

}