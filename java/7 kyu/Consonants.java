// https://www.codewars.com/kata/564e7fc20f0b53eb02000106/
public class Consonants {
  public static int getCount(String str) {
    String consonants = str.toLowerCase().replaceAll("[b-df-hj-np-tv-z]", "");
    return str.length() - consonants.length();
  }
}