package exercise5;

import java.net.Inet4Address;
import java.util.Iterator;
import java.util.stream.Stream;

public class FirstAndSecondStream {
    public static void main(String[] args) {
        Stream<Integer> first = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> second = Stream.of(6, 7, 8, 9, 10);

        Stream<Integer> zippedStream = zip(first, second);
        zippedStream.forEach(System.out::println);
    }

    private static Stream<Integer> zip(Stream<Integer> first, Stream<Integer> second) {
        Iterator<Integer> iterator1 = first.iterator();
        Iterator<Integer> iterator2 = second.iterator();

        Stream.Builder<Integer> builder = Stream.builder();
        while(iterator1.hasNext() && iterator2.hasNext()) {
            builder.accept(iterator1.next());
            builder.accept(iterator2.next());
        }
        return builder.build();
    }
}
