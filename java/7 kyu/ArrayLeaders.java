// https://www.codewars.com/kata/5a651865fd56cb55760000e0
import java.util.*;

public class ArrayLeaders{
  public static List arrayLeaders(int[] numbers){
    List<Integer> leaders = new ArrayList<>();
    for(int i = 0; i < numbers.length; i ++) {
      int sum = Arrays.stream(Arrays.copyOfRange(numbers, i + 1, numbers.length)).sum();
      if(numbers[i] > sum) leaders.add(numbers[i]);   
    }

    return leaders;
  }
}