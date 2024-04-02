// https://www.codewars.com/kata/5aefd0a686d075d5f3000091
public class CookingTime {
  public static String getTime(String neededPower, int minutes, int seconds, String power) {
    int neededPowerNumber = Integer.parseInt(power.replaceAll("[wW]", ""));
    int powerNumber = Integer.parseInt(neededPower.replaceAll("[wW]", ""));
    int actualTime = (int) Math.ceil(((minutes * 60d + seconds) * powerNumber) / neededPowerNumber);

    return actualTime / 60 + " minutes " + actualTime % 60 + " seconds";
  }
}