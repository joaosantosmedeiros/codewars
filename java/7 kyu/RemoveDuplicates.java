import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class RemoveDuplicates{
  public static int [] solve(int [] arr){
    List<Integer> l = new ArrayList<>();
    for(int i = arr.length - 1; i >= 0; i--){
      if(!l.contains(arr[i])) l.add(arr[i]);
    }
    Collections.reverse(l);
    return l.stream().mapToInt(i -> i).toArray();
  }
}