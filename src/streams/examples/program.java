package streams.examples;

import java.util.Arrays;
import java.util.List;

public class program {

    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1, 5, 8, 9, 1, 4, 7, 6, 6, 9, 9);

        // Java 8 - Streams
        // stream - fluxo de dados
        lista.stream()
                .skip(2) //operação intermediária
                .limit(5)
                .distinct()
                .map(e -> e * 2) // a lista original não é modificada
                .forEach(System.out::println);

        // stream = loops implícitos
        // for - while - do..while = loops explícitos

        Long count = lista.stream()
                .filter(e -> e %  2 == 0)
                .count();
        System.out.println(count);
    }
}
