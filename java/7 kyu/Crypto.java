// https://www.codewars.com/kata/5f3142b3a28d9b002ef58f5e/train/java
class Crypto {
  public static String wordPattern(final String word) {
    String usedLetters = "";
    String wordPattern = "";
    for (int i = 0; i < word.length(); i++) {
      String letter = Character.toString(word.charAt(i)).toLowerCase();
      if (!usedLetters.contains(letter)) {
        usedLetters += letter;
      }
      wordPattern += i != word.length() - 1 ? usedLetters.indexOf(letter) + "." : usedLetters.indexOf(letter);
    }
    return wordPattern;
  }
}