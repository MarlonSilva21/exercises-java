package consumer.application;

import consumer.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 500.00));
        list.add(new Product("HD Case", 80.00));

        list.forEach( product -> product.setPrice(product.getPrice() * 1.1));

        list.forEach(System.out::println);

    }
}
