// https://www.codewars.com/kata/544a54fd18b8e06d240005c0
public class FindSmallest {

  public static int findSmallest( final int[] numbers, final String toReturn ) {
    int minValue = Integer.MAX_VALUE;
    int idx = -1;
    for(int i = 0; i < numbers.length; i ++){
      if(numbers[i] < minValue) {
        idx = i;
        minValue = numbers[i];
      }
    }
    return toReturn.equalsIgnoreCase("value") ? minValue : idx;
	}
}