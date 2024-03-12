// https://www.codewars.com/kata/566091b73e119a073100003a
import java.util.Map;

public class EightiesKids1 {

  public static String totalLicks(Map<String, Integer> env) {
    int licks = 252 + env.values().stream().mapToInt(i -> i).sum();
    int max = 0;
    String var = "";
    String[] keys = env.keySet().toArray(new String[0]);

    for (int i = 0; i < keys.length; i++) {
      if (env.get(keys[i]) >= max) {
        max = env.get(keys[i]);
        var = keys[i];
      }
    }

    return "It took " + licks + " licks to get to the tootsie roll center of a tootsie pop."
        + (max > 0 ? " The toughest challenge was " + var + "." : "");
  }

}