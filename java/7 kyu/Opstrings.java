// https://www.codewars.com/kata/56dbe0e313c2f63be4000b25
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Opstrings {

  public static String vertMirror(String strng) {
    return Arrays.stream(strng.split("\n")).map(word -> new StringBuilder(word).reverse().toString()).collect(Collectors.joining("\n"));
  }

  public static String horMirror (String strng) {
    String[] words = strng.split("\n");
    return IntStream.range(0, words.length).mapToObj(i -> words[words.length -i - 1]).collect(Collectors.joining("\n"));
  }

  public static String oper( Function<String, String> op , String s) {
    return op.apply(s);
  }
}