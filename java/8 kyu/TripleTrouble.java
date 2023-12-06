// https://www.codewars.com/kata/5704aea738428f4d30000914/train/java
public class TripleTrouble {
  public static String tripleTrouble(String one, String two, String three) {
    String result = "";

    for(int i = 0; i < one.length(); i++){
      result += ("" + one.charAt(i) + two.charAt(i) + three.charAt(i));
    }

    return result;
  }
}