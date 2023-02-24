package Task3;

import java.util.*;
import java.util.stream.Collectors;

public class Task3Test {
    public static void main(String[] args) {
        List<String> number = Arrays.asList("1, 2, 0", "4, 5");
        Task3Test test = new Task3Test();
        System.out.println(test.getNumbers(number));

    }

    Comparator<Integer> comparator = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1.compareTo(o2);
        }
    };

    private List<Integer> getNumbers(List<String> number) {
        return number.stream()
                .map(str1 -> List.of(str1.split(", ")))
                .flatMap(Collection::stream)
                .map(Integer::parseInt)
                .sorted(comparator)
                .collect(Collectors.toList());

    }
}

