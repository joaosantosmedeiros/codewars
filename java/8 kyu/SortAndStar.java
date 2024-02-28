// https://www.codewars.com/kata/57cfdf34902f6ba3d300001e
import java.util.Arrays;

public class SortAndStar {

  public static String twoSort(String[] s) {
    Arrays.sort(s);
    String[] first = s[0].split("");
    return String.join("***", first);
  }
}