package Task3;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Task3Test {
    public static void main(String[] args) {
        List<String> number = Arrays.asList("1, 2, 0", "4, 5");

        List<String> result = number.stream()
                .map(str1 -> List.of(str1.split(", ")))
                .flatMap(Collection::stream)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
