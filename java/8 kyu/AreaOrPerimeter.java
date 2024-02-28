// https://www.codewars.com/kata/5ab6538b379d20ad880000ab
public class AreaOrPerimeter {
  public static int areaOrPerimeter(int l, int w) {
    return l == w ? l * w : l + l + w + w;
  }
}