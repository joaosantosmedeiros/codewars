// https://www.codewars.com/kata/56f3a1e899b386da78000732
import java.util.Arrays;

public class Partlist {

  public static String[][] partlist(String[] arr) {
    String[][] combinations = new String[arr.length - 1][2];
    for (int i = 0; i < arr.length - 1; i++) {
      combinations[i] = new String[] {
          String.join(" ", Arrays.copyOfRange(arr, 0, i + 1)),
          String.join(" ", Arrays.copyOfRange(arr, i + 1, arr.length)) };
    }
    return combinations;
  }
}