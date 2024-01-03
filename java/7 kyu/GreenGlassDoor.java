// https://www.codewars.com/kata/5642bf07a586135a6f000004/train/java
public class GreenGlassDoor {
    boolean stepThroughWith(String s) {
        String[] letters = s.split("");
        for (int i = 0; i < letters.length - 1; i++) {
            if(letters[i].equals(letters[i + 1])){
                return true;
            }
        }
        return false;
    }

}