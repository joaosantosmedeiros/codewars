// https://www.codewars.com/kata/58acfe4ae0201e1708000075
import java.util.stream.IntStream;

public class InviteMoreWomen {
    public static boolean inviteMoreWomen(int[] l) {
        long woman = IntStream.of(l).filter(n -> n == -1).count();
        return woman < l.length - woman;
    }
}
