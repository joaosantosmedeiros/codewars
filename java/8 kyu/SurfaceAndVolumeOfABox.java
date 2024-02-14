// https://www.codewars.com/kata/565f5825379664a26b00007c
public class SurfaceAndVolumeOfABox {
  public static int[] getSize(int w, int h, int d) {
    int area = (w * h * 2) + (h * d * 2) + (w * d * 2);
    int volume = w * h * d;
    return new int[] { area, volume };
  }
}