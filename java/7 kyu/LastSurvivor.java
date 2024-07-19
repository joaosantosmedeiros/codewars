// https://www.codewars.com/kata/609eee71109f860006c377d1
public class LastSurvivor {
  public static String lastSurvivor(String letters, int[] coords) {
    for (int i = 0; i < coords.length; i++) {
      letters = letters.substring(0, coords[i]) + letters.substring(coords[i] + 1);
    }
    return letters;
  }
}
