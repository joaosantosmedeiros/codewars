// https://www.codewars.com/kata/58cb43f4256836ed95000f97
import java.util.stream.IntStream;

public class CuboidVolumes {
  public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
    int firstVolume = IntStream.of(firstCuboid).reduce(1, (a, b) -> a *= b);
    int secondVolume = IntStream.of(secondCuboid).reduce(1, (a, b) -> a *= b);
    return Math.abs(firstVolume - secondVolume);
  }
}