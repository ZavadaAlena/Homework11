package Task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5Test {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(14, 77, 88, 99, 101, 116);
        Stream<Integer> stream2 = Stream.of(155, 111, 522, 255, 666);
        Stream<Integer> zip = zip(stream1, stream2);
        System.out.println(zip.collect(Collectors.toList()));


    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> result = new ArrayList<>();
        Iterator<T> iterator1 = first.iterator();
        Iterator<T> iterator2 = second.iterator();
        while (iterator1.hasNext() && iterator2.hasNext()) {
            result.add(iterator1.next());
            result.add(iterator2.next());

        }
        return result.stream();

    }
}
