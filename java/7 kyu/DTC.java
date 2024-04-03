// https://www.codewars.com/kata/6397b0d461067e0030d1315e
public class DTC {
  public static double toIndustrial(String time) {
    String[] splittedTime = time.split(":");
    int hours = Integer.parseInt(splittedTime[0]);
    int minutes = Integer.parseInt(splittedTime[1]);

    return Double.parseDouble(String.format("%.2f", ((hours * 60 + minutes) * 60 / 3600d)));
  }

  public static double toIndustrial(int time) {
    return Double.parseDouble(String.format("%.2f", (time * 60) / 3600d));
  }

  public static String toNormal(double time) {
    double normalTIme = Math.round((time / 60) * 3600d);
    int normalHours = (int) (normalTIme / 60);
    int normalMinutes = (int) (normalTIme % 60);

    return String.format("%s:%s",
        normalHours,
        normalMinutes < 10 ? "0" + normalMinutes : normalMinutes);
  }
}