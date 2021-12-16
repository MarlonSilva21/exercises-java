package methodreferences;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class ExampleMethodsReference {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        list.stream()
                .forEach(System.out::println);

        //methods statics
        list.stream()
                .map(ExampleMethodsReference::multiplyBy2)
                .forEach(System.out::println);

        //constructors
        list.stream()
                .map(n -> new BigDecimal(n))
                .forEach(System.out::println);

        list.stream()
                .map(BigDecimal::new)
                .forEach(System.out::println);

        //instances
        list.stream()
                .map(n -> n.doubleValue())
                .forEach(System.out::println);

        list.stream()
                .map(Integer::doubleValue)
                .forEach(System.out::println);

        //instance
        BigDecimal dois = new BigDecimal(2);
        list.stream()
                .map(BigDecimal::new)
                .map(b -> dois.multiply(b))
                .forEach(System.out::println);

        list.stream()
                .map(BigDecimal::new)
                .map(dois::multiply)
                .forEach(System.out::println);


    }

    private static Integer multiplyBy2(int i) {
        return i * 2;
    }
}
