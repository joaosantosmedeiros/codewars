// https://www.codewars.com/kata/643af0fa9fa6c406b47c5399/train/java
public class Quadrants {
  public static int quadrant(int x, int y) {
    if(x > 0){
      return y > 0 ? 1 : 4;
    }
    return y > 0 ? 2 : 3;
  }
}