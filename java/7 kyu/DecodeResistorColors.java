// https://www.codewars.com/kata/57cf3dad05c186ba22000348/solutions/java
import java.util.HashMap;
import java.util.Map;

public class DecodeResistorColors {
  public static String decodeResistorColors(String bands) {

    Map<String, Integer[]> colorsDigit = new HashMap<>();
    colorsDigit.put("black", new Integer[] { 0, 1 });
    colorsDigit.put("brown", new Integer[] { 1, 10 });
    colorsDigit.put("red", new Integer[] { 2, 100 });
    colorsDigit.put("orange", new Integer[] { 3, 1000 });
    colorsDigit.put("yellow", new Integer[] { 4, 10000 });
    colorsDigit.put("green", new Integer[] { 5, 100000 });
    colorsDigit.put("blue", new Integer[] { 6, 1000000 });
    colorsDigit.put("violet", new Integer[] { 7, 10000000 });
    colorsDigit.put("gray", new Integer[] { 8, 100000000 });
    colorsDigit.put("white", new Integer[] { 9, 1000000000 });
    colorsDigit.put("gold", new Integer[] { 5 });
    colorsDigit.put("silver", new Integer[] { 10 });

    String[] colors = bands.split(" ");

    int number = (colorsDigit.get(colors[0])[0] * 10 + colorsDigit.get(colors[1])[0]) * colorsDigit.get(colors[2])[1];
    String stringfiedNumber = String.valueOf(number);
    if (number >= 1000000) {
      stringfiedNumber = number % 1000000 == 0 ? number / 1000000 + "M" : number / 1000000d + "M";
    } else if (number >= 1000) {
      stringfiedNumber = number % 1000 == 0 ? number / 1000 + "k" : number / 1000d + "k";
    }

    int percentage = colors.length == 4 ? colorsDigit.get(colors[3])[0] : 20;
    return stringfiedNumber + " ohms, " + percentage + "%";
  }
}