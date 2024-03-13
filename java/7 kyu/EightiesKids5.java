// https://www.codewars.com/kata/5667525f0f157f7a0a000004
public class EightiesKids5 {

  public static String bucketOf(String said) {
    said = said.toLowerCase();
    boolean water = said.contains("water") || said.contains("wet") || said.contains("wash");
    boolean slime = said.contains("slime") || said.contains("i don't know");
    boolean sludge = water && slime;

    return sludge ? "sludge" : water ? "water" : slime ? "slime" : "air";
  }
}