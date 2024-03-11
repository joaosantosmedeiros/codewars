// https://www.codewars.com/kata/65c0161a2380ae78052e5731
public class Minecraft {
  public static int stonePick(String[] arr) {
    int stick = 0;
    int stone = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].equalsIgnoreCase("Wood")) {
        stick += 4;
      }
      if (arr[i].equalsIgnoreCase("Sticks")) {
        stick++;
      }
      if (arr[i].equalsIgnoreCase("Cobblestone")) {
        stone++;
      }
    }

    return Math.min(stick / 2, stone / 3);
  }
}