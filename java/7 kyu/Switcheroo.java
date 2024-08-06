// https://www.codewars.com/kata/55d410c492e6ed767000004f
import java.util.stream.IntStream;

public class Switcheroo {
    public static String vowel2Index(String s) {
        String[] letters = s.split("");
        int[] idxs = IntStream.rangeClosed(1, s.length()).toArray();
        for(int i = 0; i < letters.length; i ++) {
            if(letters[i].matches("[aeiouAEIOU]")) letters[i] = idxs[i] + "";
        }
        return String.join("", letters);
    }
  }