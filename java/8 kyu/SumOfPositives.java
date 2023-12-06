// https://www.codewars.com/kata/5715eaedb436cf5606000381/train/java

public class SumOfPositives{
  public static int sum(int[] arr){
    int sum = 0;
    for (int num : arr) {
      if(num > 0){
        sum += num;
      }
    }
    return sum;
  }
}