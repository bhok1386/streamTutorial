import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class stream {

    public static void main(String[] args) {

        System.out.println("hello");

        // Java 8 Stream
        // Allows to access the data statelessly
        // Allows to perform functions on the array

        List<String> myList =
                Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList
                .stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        myList
                .stream()
                .forEachOrdered(System.out::println);

//        // Using stream and using a filter with lambda
//        Stream.of("d2", "a2", "b1", "b3", "c")
//                .filter(s-> {
//                    System.out.println("filter: " + s);
//                    return true;
//                })
//                .forEach(s -> System.out.println("forEach: " + s));

        Stream.of("d2", "a2", "b1", "b3", "c")
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .anyMatch(s -> {
                    System.out.println("anyMatch: " + s);
                    return s.startsWith("A");
                });
    }
}
