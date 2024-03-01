// https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3
public class AbbreviateTwoWords {

  public static String abbrevName(String name) {
    String[] nameSplit = name.split(" ");

    return String.valueOf(nameSplit[0].charAt(0)).toUpperCase() + "."
        + String.valueOf(nameSplit[1].charAt(0)).toUpperCase();
  }
}