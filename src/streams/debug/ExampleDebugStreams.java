package streams.debug;

import java.util.Arrays;
import java.util.List;

public class ExampleDebugStreams {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 5, 8, 9);

        //method peek for supporting in debug

        list.stream()
                .map(n -> new StringBuilder().append(n).append("s").append("a"))
                .forEach(System.out::println);


    }
}
