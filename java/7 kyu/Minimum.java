// https://www.codewars.com/kata/5ac6932b2f317b96980000ca/
import java.util.Arrays;

public class Minimum{

	public static int minValue(int[] values){
	
		return Integer.parseInt(String.join("", Arrays.stream(values).distinct().sorted().mapToObj(n -> String.valueOf(n)).toList()));
	}

}