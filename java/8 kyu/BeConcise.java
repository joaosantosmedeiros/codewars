// https://www.codewars.com/kata/5703c093022cd1aae90012c9
import java.util.Arrays;public class BeConcise{public static String kata(String[]a,String s){int i=Arrays.asList(a).indexOf(s);return i==-1?"Not found":"" + i;}}