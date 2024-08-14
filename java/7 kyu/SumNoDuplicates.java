// https://www.codewars.com/kata/5993fb6c4f5d9f770c0000f2
import java.util.Arrays;

public class SumNoDuplicates{
    public static int sumNoDuplicates(int[] arr){
      int duplicates = Arrays.stream(arr).filter(n -> Arrays.stream(arr).filter(num -> n == num).count() > 1).distinct().sum();
      return Arrays.stream(arr).distinct().sum() - duplicates;
    }
}
