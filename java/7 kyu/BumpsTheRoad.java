// https://www.codewars.com/kata/57ed30dde7728215300005fa

public class BumpsTheRoad {
  public static String bumps(final String road) {
    return road.replaceAll("[^n]", "").length() <= 15 ? "Woohoo!" : "Car Dead";
  }
}