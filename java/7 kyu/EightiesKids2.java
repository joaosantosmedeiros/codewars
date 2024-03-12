// https://www.codewars.com/kata/5660aa3d5e011dfd6e000063
public class EightiesKids2 {

  public static String findSpaceship(String map) {
    String[] mapSplitted = map.split("\n");
    for (int i = 0; i < mapSplitted.length; i++) {
      if (mapSplitted[i].contains("X")) {
        return "[" + (mapSplitted[i].indexOf("X")) + ", " + (mapSplitted.length - 1 - i) + "]";
      }
    }

    return "Spaceship lost forever.";
  }
}