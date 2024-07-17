// https://www.codewars.com/kata/5af15a37de4c7f223e00012d
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MenFromBoys {
    public static int[] menFromBoys(final int[] values) {
        List<Integer> man = IntStream.of(values).filter(n -> n % 2 == 0).sorted().boxed().collect(Collectors.toList());
        List<Integer> boys = IntStream.of(values).filter(n -> n % 2 != 0).boxed().sorted((a, b) -> b - a).toList();
        man.addAll(boys);
        return man.stream().distinct().mapToInt(i -> i).toArray();
    }
}