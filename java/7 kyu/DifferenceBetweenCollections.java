import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class DifferenceBetweenCollections {
  public static List<Character> diff(Collection<Character> a, Collection<Character> b) {
    List<Character> duplicates = new ArrayList<>(); 
    for(int i = 0; i < a.size(); i ++) {
      int counter = 0;
      if(b.contains(a.toArray()[i])){
        counter ++;
      }
      if(counter == 0){
        duplicates.add((Character) a.toArray()[i]);
      }
    }
    for(int i = 0; i < b.size(); i ++) {
      int counter = 0;
      if(a.contains(b.toArray()[i])){
        counter ++;
      }
      if(counter == 0){
        duplicates.add((Character) b.toArray()[i]);
      }
    }
    return duplicates.stream().sorted().distinct().collect(Collectors.toList());
  }
}