package lambdas;

import java.util.stream.IntStream;

public class ExampleLambdas {

    public static void main(String[] args) {

        IntStream.range(0, 5)
                .filter(n -> n % 2 == 0)
                .reduce(Integer::sum)
                .ifPresent(System.out::println);


        IntStream.range(0, 5)
                .filter(n -> {
                    System.out.println("Resultados: ");
                    return n % 2 == 0;
                })
                .forEach(System.out::println);
    }
}
