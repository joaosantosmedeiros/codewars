// https://www.codewars.com/kata/554e4a2f232cdd87d9000038

public class DnaStrand {
  public static String makeComplement(String dna) {
    String[] letters = dna.split("");
    for(int i = 0; i < letters.length; i ++) {
      letters[i] = letters[i].equals("A") ? "T" : letters[i].equals("T") ? "A" : letters[i].equals("C") ? "G" : "C"; 
    }
    
    return String.join("", letters);
  }
}