// https://www.codewars.com/kata/51c8991dee245d7ddf00000e/solutions/
public class ReverseWords {

  public static String reverseWords(String str) {
    
    String[] words = str.split(" ");

    for (int i = 0; i <= words.length / 2; i++) {
      String actual = words[i];
      words[i] = words[words.length - i - 1];
      words[words.length - i - 1] = actual;
    }

    return String.join(" ", words);
  }
}