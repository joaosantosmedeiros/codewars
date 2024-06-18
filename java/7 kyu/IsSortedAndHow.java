// https://www.codewars.com/kata/580a4734d6df748060000045
import java.util.Arrays;
import java.util.Comparator;

public class IsSortedAndHow { 
  public static String isSortedAndHow(int[] array) {
    int[] ascendingArr = Arrays.copyOf(array, array.length);

    Arrays.sort(ascendingArr);
    if(Arrays.equals(ascendingArr, array)) return "yes, ascending";

    int[] descendingArr = Arrays.stream(array).boxed().sorted(Comparator.reverseOrder()).mapToInt(i -> i).toArray();
    if(Arrays.equals(descendingArr, array)) return "yes, descending";
    

    return "no";
  }
}