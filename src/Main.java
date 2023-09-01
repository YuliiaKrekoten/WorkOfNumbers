import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> Intlist = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        List<Integer> positiveNumbers = new ArrayList<>();
        for(int num : Intlist) {
            if(num > 0) {
                positiveNumbers.add(num);
            }
        }
        List<Integer> evenNumbers = new ArrayList<>();
        for (int num : positiveNumbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }
        evenNumbers.sort(Comparator.naturalOrder());
        for (int num : evenNumbers) {
            System.out.println(num);
        }


    }


}