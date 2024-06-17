// https://www.codewars.com/kata/5390bac347d09b7da40006f6
public class JadenCase {

	public String toJadenCase(String phrase) {
    if(phrase == null || phrase.length() == 0){
      return null;
    }
    
		String[] words = phrase.split(" ");
    for(int i = 0; i < words.length; i ++) {
      words[i] = Character.toString(words[i].charAt(0)).toUpperCase() + words[i].substring(1, words[i].length());
    }
		
		return String.join(" ", words);
	}

}