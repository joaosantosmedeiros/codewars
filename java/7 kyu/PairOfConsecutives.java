// https://www.codewars.com/kata/5a3e1319b6486ac96f000049
public class PairOfConsecutives {
  public static int solve(int[] arr) {
    int count = 0;
    for(int i = 0; i < arr.length - 1; i += 2){
      if(Math.abs(arr[i] - arr[i + 1]) == 1) count ++;
    }
    return count;
  }
}