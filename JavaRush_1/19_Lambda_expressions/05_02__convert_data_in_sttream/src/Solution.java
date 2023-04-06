import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Не", "хвилюйтеся", "якщо", "щось", 
                "не", "працює.", "Коли", "б", "усе", "працювало", "вас", "би", 
                "звільнили.");

        toUpperCase(stream).forEach(System.out::println);
    }

    public static Stream<String> toUpperCase(Stream<String> strings) {
        return strings.map(x -> x.toUpperCase());
    }
}