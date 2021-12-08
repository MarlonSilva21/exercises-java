package reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class Example_Streams_Reduce {

    public static void main(String[] args) {

        /*
         * Reduce -> pegar todos os elementos de uma stream
         * e transformar em um só elemento
         * */

        String s = "Necessito de um emprego";
        String[] split = s.split(" ");
        List<String> listStr = Arrays.asList(split);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> listaVazia = Arrays.asList();

        //Reduce soma
        Optional<Integer> soma = list.stream().reduce((n1, n2) -> n1 + n2);
        System.out.println(soma.get());

        //Reduce multiplicação
        Optional<Integer> multiplicacao = list.stream().reduce((n1, n2) -> n1 * n2);
        System.out.println(multiplicacao.get());

        //Reduce concatenação
        Optional<String> concatenacao = listStr.stream().reduce(String::concat);
        System.out.println(concatenacao.get());

        //Reduce subtração -> subtraçao nao é uma operação associativa e vai contra as recomendações da api - NÃO FAÇA
        Optional<Integer> subtracao = list.stream().reduce((n1, n2) -> n1 - n2);
        System.out.println(subtracao.get());


        /*
         * Reduce -> valor de identidade
         * */

        //Reduce soma
        Integer soma2 = list.stream().reduce(0, (n1, n2) -> n1 + n2);
        System.out.println(soma2);

//        //Reduce multiplicação
        Integer multiplicacao2 = list.stream().reduce(1, (n1, n2) -> n1 * n2);
        System.out.println(multiplicacao2);
//
//        //Reduce concatenação
        String concatenacao2 = listStr.stream().reduce("", (s1, str) -> s1.concat(str));
        System.out.println(concatenacao2);
//
//        //Reduce -> Menor valor
        OptionalDouble reduce = DoubleStream.of(1.5, 2.9, 6.7).reduce((d1, d2) -> Math.min(d1, d2));
        System.out.println(reduce);
    }
}
