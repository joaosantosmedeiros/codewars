// https://www.codewars.com/kata/5c8bfa44b9d1192e1ebd3d15
import java.util.Arrays;

public class WarnTheSheep {

  public static String warnTheSheep(String[] array) {
    int index = Arrays.asList(array).indexOf("wolf");
    int sheep = array.length - index - 1;
    return index == array.length - 1 ? "Pls go away and stop eating my sheep"
        : "Oi! Sheep number " + sheep + "! You are about to be eaten by a wolf!";
  }

}