import java.util.List;
import java.util.Map;

public class MyLanguages {
  public static List<String> myLanguages(final Map<String, Integer> results) {
    List<String> languages = results.keySet().stream().filter(language -> results.get(language) >= 60).sorted((l1, l2) -> results.get(l1) - results.get(l2)).toList();
    return languages;
  }
}
