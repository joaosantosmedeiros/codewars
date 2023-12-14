// https://www.codewars.com/kata/59bd84b8a0640e7c49002398/train/java
import java.util.Arrays;
import java.util.List;

public class TriangleArea {
  public static float tArea(String tStr) {
    List<String> arr = Arrays.asList(tStr.split("\n"));

    int height = arr.size() - 2;
    int base = (arr.getLast().replace(" ", "").length()) - 1;

    return (float) (base * height) / 2;
  }
}