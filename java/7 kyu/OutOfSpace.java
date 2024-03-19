// https://www.codewars.com/kata/56576f82ab83ee8268000059
import java.util.Arrays;

public class OutOfSpace {

  public static String[] spacey(String[] array) {
    String[] joinedStrings = new String[array.length];

    for (int i = 0; i < array.length; i++) {
      joinedStrings[i] = String.join("", Arrays.copyOfRange(array, 0, i));
    }

    return joinedStrings;
  }
}