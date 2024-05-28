// https://www.codewars.com/kata/55d8dc4c8e629e55dc000068

public class Trigrams {
	public static String trigrams( String phrase ) {
		StringBuilder sb = new StringBuilder("");
    for(int i = 0; i < phrase.length() - 2; i ++) {
      sb.append(phrase.substring(i, i + 3).replaceAll(" ", "_") + " ");
    }
    
    return sb.toString().trim();
	}
}
