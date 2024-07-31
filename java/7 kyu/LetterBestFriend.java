//https://www.codewars.com/kata/64fc03a318692c1333ebc04c/train/java
public class LetterBestFriend {
	public static boolean bestFriend(String txt, char a, char b) {
		String sequence = Character.toString(a) + Character.toString(b);
		int lengthAB = txt.replaceAll(sequence, "").length();
		int lengthA = txt.replaceAll(Character.toString(a), "").length();
		return txt.length() - lengthAB == (txt.length() - lengthA) * 2;
	}
}