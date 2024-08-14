// https://www.codewars.com/kata/57c1ab3949324c321600013f/solutions/java
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ToLeetSpeak {
  static String toLeetSpeak(final String speak) {
    Map<Character, Character> alphabet = new HashMap<>();
    alphabet.put('A', '@');
    alphabet.put('B', '8');
    alphabet.put('C', '(');
    alphabet.put('D', 'D');
    alphabet.put('E', '3');
    alphabet.put('F', 'F');
    alphabet.put('G', '6');
    alphabet.put('H', '#');
    alphabet.put('I', '!');
    alphabet.put('J', 'J');
    alphabet.put('K', 'K');
    alphabet.put('L', '1');
    alphabet.put('M', 'M');
    alphabet.put('N', 'N');
    alphabet.put('O', '0');
    alphabet.put('P', 'P');
    alphabet.put('Q', 'Q');
    alphabet.put('R', 'R');
    alphabet.put('S', '$');
    alphabet.put('T', '7');
    alphabet.put('U', 'U');
    alphabet.put('V', 'V');
    alphabet.put('W', 'W');
    alphabet.put('X', 'X');
    alphabet.put('Y', 'Y');
    alphabet.put('Z', '2');

    return speak.chars().mapToObj(ch -> Character.toString(alphabet.getOrDefault((char) ch, (char) ch))).collect(Collectors.joining(""));
  }
}