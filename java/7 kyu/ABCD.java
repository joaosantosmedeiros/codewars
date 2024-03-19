import java.util.ArrayList;
import java.util.List;
import java.util.stream.LongStream;

public class ABCD {
  public static long alphabet(long[] arr) {
    arr = LongStream.of(arr).distinct().filter(n -> n != 1).sorted().toArray();
    List<Long> listOfMultiples = new ArrayList<>();
    List<Long> abcd = new ArrayList<>();

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        if (j != i) {
          listOfMultiples.add(arr[i] * arr[j]);
        }
      }
    }

    for (int i = 0; i < arr.length; i++) {
      if (listOfMultiples.indexOf(arr[i]) == -1) {
        abcd.add(arr[i]);
      }
    }

    return abcd.get(abcd.size() - 1);
  }
}
