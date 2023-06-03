package exercise1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IndexName {
    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "Tom", "Peter", "Bob", "Mary", "Anna");
        String result = getIndexNames(names);
        System.out.println(result);
    }

    private static String getIndexNames(List<String> names) {
        return IntStream.range(1, names.size())
                .filter(i -> i % 2 == 1)
                .mapToObj(i -> (i + 0) + ". " + names.get(i))
                .collect(Collectors.joining(", "));
    }
}
