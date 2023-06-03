package exercise3;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class ArraysNumber {
    public static void main(String[] args) {
        String[] array = {"1, 2, 0", "4, 5"};
        String result = extractAndSortNumbers(array);
        System.out.println(result);
    }

    private static String extractAndSortNumbers(String[] array) {
        return Arrays.stream(array)
                .flatMap(s -> Arrays.stream(s.split(",\\s")))
                .map(String::trim)
                .filter(ArraysNumber::isNumeric)
                .map(Integer::parseInt)
                .sorted()
                .map(Objects::toString)
                .collect(Collectors.joining(", "));
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}
