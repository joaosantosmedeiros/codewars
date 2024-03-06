public class SignLanguage {
  public static boolean gaslighting(String shirtWord, String yourWord, char[] friendsLetters) {
    if (shirtWord == yourWord) {
      return false;
    }

    for (int i = 0; i < shirtWord.length(); i++) {
      boolean doesHeKnow = false;

      for (int j = 0; j < friendsLetters.length; j++) {
        if (friendsLetters[j] == shirtWord.charAt(i) || friendsLetters[j] == yourWord.charAt(i)) {
          doesHeKnow = true;
        }
      }
      if (shirtWord.charAt(i) != yourWord.charAt(i) && doesHeKnow) {
        return true;
      }
    }

    return false;
  }
}