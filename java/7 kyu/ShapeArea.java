import java.util.stream.IntStream;

public class ShapeArea {
    public static int shapeArea(int n) {
        return IntStream.rangeClosed(2, n).map(number -> (number - 1) * 4).sum() + 1;
    }
}
