import java.util.stream.IntStream;

public class Kata {
    public static int expressionsMatter(int a, int b, int c) {
        var v = a + b + c;
        var w = a * b * c;
        var x = a + b * c;
        var y = (a + b) * c;
        var z = a * (b + c);

        return IntStream.of(x, y, z, w, v).max().orElse(0);
    }
}