// https://www.codewars.com/kata/558fc85d8fd1938afb000014
import java.util.Arrays;
public class SumTwoSmallestNumbers{
  public static long sumTwoSmallestNumbers(final long [] numbers) {
    if(numbers.length == 0) return 0l;
    if(numbers.length == 1) return numbers[0];
    Arrays.sort(numbers);
    return numbers[0] + numbers[1]; 
  }             
}