public class HistogramH1 {

  public static String histogram(final int results[]) {
    StringBuilder sb = new StringBuilder("");
    for (int i = results.length - 1; i >= 0; i--) {
      sb.append((i + 1) + "|" + "#".repeat(results[i]) + (results[i] == 0 ? "" : " " + results[i]) + "\n");
    }
    return sb.toString();
  }
}