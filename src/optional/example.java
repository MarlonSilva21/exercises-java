package optional;

import java.util.Optional;

public class example {

    public static void main(String[] args) {

        String s = "1";
        converteEmNumero(s).ifPresent(System.out::println); // ifPresent -> verifica se tem um valor presente com um if implícito e executa a lambda

        Integer numero = converteEmNumero(s).orElse(5); //orElse -> funciona como um valor default caso nao tenha um valor definiddo
        System.out.println(numero);

        Integer numero1 = converteEmNumero(s).orElseGet(() -> 5); //orElseGet -> a diferença para o orElse é que ele recebe uma expressão lambda e pode fazer uma operação mais pesada
        System.out.println(numero1);

        Integer numero2 = converteEmNumero(s).orElseThrow(() -> new NullPointerException("Valor vazio")); //orElseThrow lança uma excessão
        System.out.println(numero2);

        /*
        * Optional é recomendavel apenas como retorno de método
        * e nao se deve aceitar um optional como parametro para o mesmo
        * */
    }

    public static Optional<Integer> converteEmNumero(String numeroStr){

        try{
            Integer integer = Integer.valueOf(numeroStr);
            return Optional.of(integer);
        }
        catch (Exception e){
            return Optional.empty();
        }
    }
}
