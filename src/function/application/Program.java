package function.application;

import consumer.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 500.00));
        list.add(new Product("HD Case", 80.00));

        List<String> namesWithUpperCase = list.stream().map(product -> product.getName().toUpperCase()).collect(Collectors.toList());

        namesWithUpperCase.forEach(System.out::println);

        List<Product> namesWithT = list.stream().filter(product -> product.getName().charAt(0) == 'T').collect(Collectors.toList());

        namesWithT.forEach(System.out::println);

    }
}
