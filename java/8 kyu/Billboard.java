// https://www.codewars.com/kata/570e8ec4127ad143660001fd
public class Billboard {

  public static int billboard(String name, int price) {
    return name == null ? 0 : Math.multiplyExact(name.length(), price);
  }
}