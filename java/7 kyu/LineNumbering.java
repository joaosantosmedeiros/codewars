// https://www.codewars.com/kata/54bf85e3d5b56c7a05000cf9
import java.util.*;

public class LineNumbering {
  public static List<String> number(List<String> lines) {
    for(int i = 0; i < lines.size(); i ++) {
      lines.set(i, (i + 1) + ": "+ lines.get(i));
    }
    return lines;
  }
}