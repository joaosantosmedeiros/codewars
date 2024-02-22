
// https://www.codewars.com/kata/5601409514fc93442500010b
import java.util.Arrays;

public class BetterThanAverage {
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    int totalScores = Arrays.stream(classPoints).sum() + yourPoints;
    double average = totalScores / (classPoints.length + 1);
    return yourPoints > average;
  }
}