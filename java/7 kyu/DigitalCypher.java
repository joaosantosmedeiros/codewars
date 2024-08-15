// https://www.codewars.com/kata/592e830e043b99888600002d
import java.util.List;
import java.util.stream.IntStream;
import java.util.Arrays;

public class DigitalCypher{
  public static int[] encode(String message, int key) {
    List<String> alphabet = List.of("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z");
    int[] digits = Arrays.stream((key + "").split("")).mapToInt(i -> Integer.parseInt(i)).toArray();
    String[] letters = message.split("");
    
    return IntStream.range(0, message.length()).map(i -> alphabet.indexOf(letters[i]) + 1 + digits[i % digits.length]).toArray();
  }
}