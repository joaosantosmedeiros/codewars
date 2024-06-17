// https://www.codewars.com/kata/5656b6906de340bd1b0000ac
import java.util.stream.Collectors;
import java.util.Arrays;

public class TwoToOne {    
    public static String longest (String s1, String s2) {
        return Arrays.stream((s1 + s2).split("")).sorted().distinct().collect(Collectors.joining(""));
    }
}