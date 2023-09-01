import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {

            List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
            List<Integer> resultList = intList.stream()
                    .filter(x -> x > 0)
                    .filter(x -> x % 2 == 0)
                    .sorted(Comparator.naturalOrder())
                    .collect(Collectors.toList());

            for (Integer x : resultList) {
                System.out.println(x);

            }


        }
}
