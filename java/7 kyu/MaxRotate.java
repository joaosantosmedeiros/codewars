// https://www.codewars.com/kata/56a4872cbb65f3a610000026/train/java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxRotate {
  public static long maxRot(long n) {
    String[] lettersArr = Long.toString(n).split("");
    List<String> lettersArrList = new ArrayList<String>(Arrays.stream(lettersArr).toList());
    long maxNumber = n;

    for (int i = 0; i < lettersArr.length - 1; i++) {
      var removedNumber = lettersArrList.remove(i);
      lettersArrList.add(removedNumber);

      String stringfiedNumber = String.join("", lettersArrList.toArray(new String[0]));
      var alteredNumber = Long.parseLong(stringfiedNumber);
      maxNumber = alteredNumber > maxNumber ? alteredNumber : maxNumber;
    }

    return maxNumber;
  }
}
