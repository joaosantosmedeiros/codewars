public class Cogs {

  public static double cogRpm(final int[] cogs) {
    double rpm = cogs[0] * 1d / cogs[cogs.length - 1];
    return cogs.length % 2 == 0 ? -rpm : rpm;
  }

}