package exercise2;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NameToUpperCase {
    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "Tom", "Peter", "Bob", "Mary", "Anna");
        String result = getNameToUpperCase(names);
        System.out.println(result);
    }

    private static String getNameToUpperCase(List<String> names) {
        return names.stream()
                .map(String :: toUpperCase)
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList()).toString();
    }
}
