// https://www.codewars.com/kata/5662292ee7e2da24e900012fw
public class EightiesKids3 {

  public static String[] getSocks(String name, String[] socks) {
    for (int i = 0; i < socks.length; i++) {
      for (int j = 0; j < socks.length; j++) {
        if (socks[i] != socks[j] && name == "Punky") {
          return new String[] { socks[i], socks[j] };
        }
        if (socks[i] == socks[j] && i != j && name == "Henry") {
          return new String[] { socks[i], socks[i] };
        }
      }
    }

    return new String[] {};
  }
}