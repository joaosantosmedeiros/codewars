// https://www.codewars.com/kata/5700c9acc1555755be00027e/train/java
import java.util.Arrays;
import java.util.List;

public class Rotations {
    public static boolean containAllRots(String strng, List<String> arr) {
        String[] rotations = new String[strng.length()];
        for (int i = 0; i < strng.length(); i++) {
            strng = strng.substring(strng.length() - 1, strng.length()) + strng.substring(0, strng.length() - 1);
            rotations[i] = strng;
        }

        long occurrences = arr.stream().filter(str -> {
            for (int i = 0; i < rotations.length; i++) {
                if (str.equals(rotations[i]))
                    return true;
            }
            return false;
        }).count();

        return occurrences == Arrays.stream(rotations).distinct().count();
    }
}