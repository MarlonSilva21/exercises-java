package predicate.application;

import predicate.entities.Product;
import predicate.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 500.0));
        list.add(new Product("HD Case", 80.0));

//        list.removeIf(Product::staticProductPredicate);
//        list.removeIf(Product::nonStaticProductPredicate);

//        Predicate<Product> pred = p -> p.getPrice() >= 100.0;
//        list.removeIf(pred);

//        list.removeIf(new ProductPredicate());

        list.removeIf(p -> p.getPrice() >= 100);

        list.stream().forEach(p -> System.out.println(p));

    }
}
