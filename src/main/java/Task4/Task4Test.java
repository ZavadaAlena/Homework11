package Task4;


import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4Test {
    public static void main(String[] args) {
        System.out.println(linearGenerator(new Generate(), 0).collect(Collectors.toList()));

    }

    private static Stream<Long> linearGenerator(Generate generate, long seed) {
        Stream<Long> stream = Stream.iterate(seed, x -> (((generate.getA() * x + generate.getC()) % generate.getM())));
        return stream
                .limit(100)
                .peek(System.out::println);


    }
}
