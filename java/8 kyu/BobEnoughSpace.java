// https://www.codewars.com/kata/5875b200d520904a04000003
public class BobEnoughSpace {
  public static int enough(int cap, int on, int wait) {
    return on + wait <= cap ? 0 : on + wait - cap;
  }
}