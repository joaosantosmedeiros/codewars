public class Cogs2 {

  public static double[] cogRpm(final int[] cogs, final int n) {
    double rpm = cogs[n];
    double firstRpm = (n % 2 == 0 ? rpm : -rpm) / cogs[0];
    double lastRpm = ((cogs.length - 1 - n) % 2 == 0 ? rpm : -rpm) / cogs[cogs.length - 1];
    
    return new double[]{ firstRpm, lastRpm };
  }

}