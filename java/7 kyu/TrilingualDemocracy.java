import java.util.List;

public class TrilingualDemocracy {
  public static char trilingualDemocracy(char[] group) {
    List<Character> l = List.of(group[0], group[1], group[2]);
    if (l.get(0) == l.get(1) && l.get(1) == l.get(2)) {
      return l.get(0);
    }
    if (l.get(0) == l.get(1)) {
      return l.get(2);
    }
    if (l.get(1) == l.get(2)) {
      return l.get(0);
    }
    if (l.get(0) == l.get(2)) {
      return l.get(1);
    }

    if (l.indexOf('D') == -1) {
      return 'D';
    }
    if (l.indexOf('I') == -1) {
      return 'I';
    }
    if (l.indexOf('K') == -1) {
      return 'K';
    }
    return 'F';
  }
}
