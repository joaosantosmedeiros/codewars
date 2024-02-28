// https://www.codewars.com/kata/56676e8fabd2d1ff3000000c
public class FindTheNeedle {
  public static String findNeedle(Object[] haystack) {
    int index = -1;
    for (int i = 0; i < haystack.length; i++) {
      if (haystack[i] != null) {
        index = haystack[i] == "needle" ? i : index;
      }
    }

    return "found the needle at position " + index;
  }
}