// https://www.codewars.com/kata/57ee99a16c8df7b02d00045f
import java.util.Arrays;
import java.util.stream.IntStream;

public class FlattenAndSort {

	public static int[] flattenAndSort(int[][] array) {
		return Arrays.stream(array).flatMapToInt(subArr -> IntStream.of(subArr)).sorted().toArray();
	}
}
