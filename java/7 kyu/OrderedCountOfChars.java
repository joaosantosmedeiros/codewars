// https://www.codewars.com/kata/57a6633153ba33189e000074
import java.util.*;
import org.apache.commons.lang3.tuple.Pair;

public class OrderedCountOfChars {
  public static List<Pair<Character, Integer>> orderedCount(String text) {
    Map<Character, Integer> map = new LinkedHashMap<>();
    text.chars().forEach(l -> map.put((char) l, text.replaceAll("[^"+ Character.toString(l) + "]", "").length()));
    
    List<Pair<Character, Integer>> list = new ArrayList<>();
    map.forEach((k, v) -> list.add(Pair.of(k, v)));
    return list;
  }
}