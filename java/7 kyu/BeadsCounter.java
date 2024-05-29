public class BeadsCounter {
  public static int countRedBeads(final int nBlue) {
    return nBlue == 0 ? 0 : (nBlue - 1) * 2;
  }
}