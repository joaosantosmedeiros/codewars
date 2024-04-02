
// https://www.codewars.com/kata/57e17750621bca9e6f00006f
import java.util.Arrays;

public class ColoredHexes {
  public static String hexColor(String codes) {
    if (codes == null || codes.length() == 0) {
      return "black";
    }

    int[] colorsSplit = Arrays.stream(codes.split(" ")).mapToInt(code -> Integer.parseInt(code)).toArray();

    if (colorsSplit[0] == colorsSplit[1] && colorsSplit[1] == colorsSplit[2]) {
      if (colorsSplit[0] == 0) {
        return "black";
      }
      return "white";
    }

    if (colorsSplit[0] > colorsSplit[1] && colorsSplit[0] > colorsSplit[2]) {
      return "red";
    }
    if (colorsSplit[1] > colorsSplit[2] && colorsSplit[1] > colorsSplit[0]) {
      return "green";
    }
    if (colorsSplit[2] > colorsSplit[1] && colorsSplit[2] > colorsSplit[0]) {
      return "blue";
    }

    if (colorsSplit[0] == colorsSplit[1]) {
      return "yellow";
    }
    if (colorsSplit[1] == colorsSplit[2]) {
      return "cyan";
    }
    return "magenta";
  }
}