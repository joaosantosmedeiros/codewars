// https://www.codewars.com/kata/595aa94353e43a8746000120
import java.util.Arrays;

public class FindDeletedNumber {
  public static int findDeletedNumber(int[] arr, int[] mixedArr) {
    if(arr.length == 0 || arr == null) return 0;
    if(mixedArr.length == 0 || mixedArr == null) return arr[0];
    
    Arrays.sort(mixedArr);
    for (int i = 0; i < mixedArr.length; i++) {
      if(mixedArr[i] != i + 1) return i + 1;
    }
    
    if(mixedArr.length != arr.length) return arr[arr.length - 1];
    return 0;
  }
}