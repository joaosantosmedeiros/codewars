// https://www.codewars.com/kata/598d91785d4ce3ec4f000018
import java.util.List;
import java.util.stream.IntStream;
import java.util.Arrays;

public class NameValue{
  public static int [] nameValue(String [] arr){
    List<String> letters = List.of(" ","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z");
    return IntStream.range(0, arr.length).map(i -> (i + 1) * Arrays.stream(arr[i].split("")).mapToInt(d -> letters.indexOf(d)).sum()).toArray();
  }
}