// https://www.codewars.com/kata/5a58d889880385c2f40000aa
public class AutoMorphic {
    public static String autoMorphic(int number) {
        return String.valueOf(number * number).endsWith(number + "") ? "Automorphic" : "Not!!";
    }
}